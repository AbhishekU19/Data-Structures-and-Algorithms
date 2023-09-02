// PRINT CHARACTER  PATTERN

public class Patterns2 {
 public static void main(String[] args) {
    char ch = 'A';
    int n=4;
    for(int i=1;i<=n;i++){ //outter loop
        for(int j=1;j<=i;j++){// inner loop
            System.out.print(ch);
            ch++;

        }
        System.out.println();
    }



        
    // HALF PYRAMID PATTERN
        int m=4;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
    
}
