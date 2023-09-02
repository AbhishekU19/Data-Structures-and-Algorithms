public class BT3 {
     // N QUEENS
    public static void nQueens(char board[][],int row){
        //Base
        if(row==board.length){
            printBoard(board);
            //count++;/
            return;

        }
        //Column Loop
        for(int j=0;j<board.length;j++){
            board[row][j]='Q';
            nQueens(board, row+1);//Function call   for finding ony one solution if(nQueens(board, row+1)){  return true;}
            board[row][j]='.';// Backtracking step
        }
    }
    private static void printBoard(char[][] board) {
        System.out.println("------- CHESS Board-------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n=2;
        char board[][]= new char[n][n];
        // initialize 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';

            }
        }
       nQueens(board, 0);
    }
    
}
