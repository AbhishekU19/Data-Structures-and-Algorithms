public class PatRecRhombus {
    public static void Hollow_Rectangle(int totrows, int totcols){
        // outer loop= i
        for(int i=1; i<=totrows; i++){
            // inner columns = j
            for (int j=1; j<=totcols; j++){
                if(i==1 || i== totrows ||j==1 || j == totcols){ //Boundary cell print * and if not print blank space " "(i,j),(r,c)

                    System.out.print("*");
                }else {
                    System.out.println(""); // NEXT LINE

                }
                

            }
        }
    }
    public static void inverted_rotated_half_pyramid(int n){
        for(int i=1; i<=n ; i++){ // OUTER LOOP
            for (int j=1;j<=n-1;j++){ // SPACES
                System.out.print(" ");
            }
            for( int j=1; j<=i;j++){ // STARS
                System.out.print("*");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_rotated_half_pyramid(10);
        //Hollow_Rectangle(4, 5);



        
      }
        
      
    }   
    
    

