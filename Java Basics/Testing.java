 
 import java.util.Random;
 public class Testing {
    

public class  Maze {
    private static final int N = 8;
    private static final int[][] MAZE = new int[N][N];
    private static final Random RANDOM = new Random();

    private static final int[] dx = {1, 0, -1, 0};
    private static final int[] dy = {0, 1, 0, -1};

    private static boolean isValidMove(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N && MAZE[x][y] == 0;
    }

    private static void generateMaze(int x, int y) {
        MAZE[x][y] = 1;

        while (true) {
            int[] directions = new int[4];
            int count = 0;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (isValidMove(nx, ny)) {
                    directions[count++] = i;
                }
            }

            if (count == 0) {
                break;
            }

            int r = RANDOM.nextInt(count);
            int nx = x + dx[directions[r]];
            int ny = y + dy[directions[r]];
            generateMaze(nx, ny);
        }
    }

    public static void main(String[] args) {
        generateMaze(0, 0);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(MAZE[i][j] == 0 ? "X" : " ");
            }
            System.out.println();

}
}

}



 }
    

    


