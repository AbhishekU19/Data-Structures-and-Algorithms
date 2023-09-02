public class Spiralmatrix {
    public static void printSpiral(int matrix[][]){ 
    int startRow=0;
    int startCol=0;
    int endRow= matrix.length-1;
    int endCol= matrix[0].length-1;
    
    while(startRow <= endRow && startCol <= endCol){
        //TOP start row is fixed we are going from Startcol to end col//
        for(int j=startCol; j<=endCol; j++){
            System.out.print(matrix[startRow][j]+ " ");
        }
        // RIGHT
        for(int i=startRow+1; i<=endRow; i++){
           System.out.print(matrix[i] [endCol]+ " "); 
        }
        // BOTTOM
        for(int j=endCol-1; j>=startCol; j--){
            if(startRow == endRow){
                break;
            }
            System.out.print(matrix[endRow] [j]+ " ");
        }
        //LEFT
        for(int i=endRow-1; i>=startRow+1; i--){
            if(startCol == endCol){
                break;
            }
         System.out.print(matrix[i] [startCol] + " "); 

        }
        startCol++;
        startRow++;
        endCol++;
        endRow++;
    }
    
    System.out.println();
    
    
}
public static int diagonalSum(int matrix[][]){
    int sum= 0;
   // BRUTE FORCE APPROACH TC O(n^2)
//     for(int i=0; i<matrix.length; i++){
//         for(int j=0; j<matrix[0].length;j++){
//             if(i==j){
//                 sum += matrix[i][j];
//             }
//             else if(i+j == matrix.length-1){
//                 sum += matrix[i][j];
//             }
//         }
//     }
//     return sum;
// }
// OPTIMISED APPROACH TC=O(n)

 for(int i=0; i<matrix.length;i++){
    //pd
    sum += matrix[i][i];
    // overlapping condition
    if(i != matrix.length-i-1)
    /// sd
    sum+=matrix[i][matrix.length-i-1];

 }
   return sum;
}
public static void main(String[] args) {
    int matrix[][]=
    {{1,2,3,4},
     {5,6,7,8},
     {9,10,11,12},
     {13,14,15,16}};
   // printSpiral(matrix);
    System.out.println(diagonalSum(matrix));
}
}
