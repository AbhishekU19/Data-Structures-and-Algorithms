public class BT4 {
    // GRID WAYS Find the ways to reach from(0,0) to (n-1,m-1) in a N*M Grid Allowed moves are right or down
    //SUDUKO SOLVER 
    public static boolean isSafe(int suduko[][],int row, int col,int digit){
        //Column
        for(int i=0;i<=8;i++){
            if(suduko [i] [col]== digit){
                return false;
            }
        }
        //Row
        for(int j=0;j<=8;j++){
            if(suduko[row][j]==digit){
                return false;
            }
        }
        //Grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        
        // 3*3 Grid
        for(int i=sr; i<sr+3;i++){
            for(int j=sc; j<sc+3; j++){
                if(suduko[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static Boolean sudukoSolver(int suduko[][], int row, int col) {
        // BASE CASE
        if(row==9){
            return true;
        }
       
        // recursion
        int nextRow=row,nextcol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextcol=0;
        }
        if(suduko[row][col]!= 0){
             return sudukoSolver(suduko,nextRow,nextcol);
        }
        for(int digit=1; digit<=9; digit++){
            if(isSafe(suduko,row,col,digit)){
                suduko[row][col]=digit;
                if(sudukoSolver(suduko, nextRow, nextcol)) { //solution existing
                   return true;
                }
                suduko[row][col]=0;
            }
        }
        return false;
}
public static void printSuduko(int suduko[][]) {
    for(int i=0; i<9; i++){
        for(int j=0;j<9;j++){
            System.out.print(suduko[i][j]+ " ");
        }
        System.out.println();
    } 
}
public static void main(String args[]){
    int suduko[][]={{0,0,8,0,0,0,0,0,0},
{4,9,0,1,5,7,0,02}};

if(sudukoSolver(suduko,0,0)){
    System.out.println("Solutiion exists");
    printSuduko(suduko);

}else{
    System.out.println("Solution does not exist");
}
}
}