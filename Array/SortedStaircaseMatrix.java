public class SortedStaircaseMatrix {
    public static boolean staircasesrarch(int matrix[][], int key) {

    int row=0, Col = matrix[0].length-1;
    while(row < matrix.length && Col >= 0){
        if(matrix[row][Col] == key){
            System.out.println("found key at("+ row + "," + Col + ")");
                        return true;          
        }
        else if( key< matrix[row][Col]){
            Col--;
        }
        else{
            row++;
        }
    }
    System.out.println("key not found");
    return false;
}
public static void main(String[] args) {
    int matrix[][] = {{10,20,30,40},
                     {15,25,35,45},
                     {27,29,37,48},
                     {32,33,39,50}};

    int key=39;
    staircasesrarch(matrix, key);
}
}
