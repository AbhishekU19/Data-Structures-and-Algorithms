public class AdvancePattern {
    public static void Hollow_Rectangle(int totrows, int totcols){ // 1)HOLLOW RECTANGLE
        // outer loop= i
        for(int i=1; i<=totrows; i++){
            // inner columns = j
            for(int j=1; j<=totcols; j++){
                if(i==1 || i== totrows || j==1 || j == totcols){ //Boundary cell print * and if not print blank space " "(i,j),(r,c)

                    System.out.print("*");
                }else {
                    System.out.print(" "); // NEXT LINE

                }    
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int n){ // 2)INVERTED HALF PYRAMOD
        for(int i=1; i<=n ; i++){    // OUTER LOOP
            for(int j=1;j<=n-1;j++){ // SPACES
                System.out.print(" ");
            }
            for( int j=1; j<=i;j++){   // STARS
                System.out.print("*");
            }
            System.out.println();
        }
    }

   public static void inverted_rotated_half_pyramid_withNumbers(int n) {
    for(int i=1;i<=n;i++){
        // inner-numbers
        for(int j=1; j<=n-i+1; j++ ){
            System.out.print(j+" ");

        }
        System.out.println();
    }
    
   }
   
public static void floyds_triangle(int n){ // 3)FLOYDS TRIANGLE
    // outer loop i 
    int counter =1;
    for(int i=1;i<=n;i++){ 
        // inner loop how many times will counter be printed
        for(int j=1;j<=i;j++){
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println();
    }

   }
  
public static void zero_one_Triangle (int n){ // 4) Zero to One Triangle
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if((i+j) % 2==0){
                System.out.print("1");

            }else{
                System.out.print("0");
            }
        }
        System.out.println();
      

    }
   }

  // 5)BUTTERFLY PATTERN
public static void Butterfly(int n){
    // 1st Half Stars - i
    for(int i = 1;i<=n;i++){
       
        //Spaces - i
        for(int j=1; j<=i; j++){ 
        System.out.print("*");
        }
        //Stars - 2*(n-i)
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
            // Spaces - i
            for(int j=1; j<=i; j++){
            System.out.print("*");
            }
            System.out.println();
        }
    
        // 2nd Half
         for(int i=n; i>=1; i--){
          //Spaces - i
          for(int j=1;j<=i;j++){ 
            System.out.print("*");
            }
            //Stars - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
                // Spaces - i
                for(int j =1; j<=i; j++){
                System.out.print("*");
                }
                System.out.println();
            }
         }

    public static void solid_rhombus(int n){
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=(n-i);j++){ 
            System.out.print(" ");
        }
        for (int j=1; j<=n; j++){
            System.out.print("*");

        }
        System.out.println();
    }   
}

public static void Hollow_Rhombus(int n){
    for(int i=1;i<=n;i++){
        // SPACES
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        // Hollow Rectangle
        for(int j=1; j<=n; j++){
            if(i==1 || i== n || j==1|| j==n){
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
        }
        System.out.println();   
    }
}
    public static void main(String[] args) {
      Hollow_Rectangle(4, 5);
      inverted_rotated_half_pyramid(10);
      inverted_rotated_half_pyramid_withNumbers(5);
      floyds_triangle(5);
      zero_one_Triangle(5);
      Butterfly(6);
      solid_rhombus(7);
      Hollow_Rhombus(8);

      }
        
      
    }   
    
    

