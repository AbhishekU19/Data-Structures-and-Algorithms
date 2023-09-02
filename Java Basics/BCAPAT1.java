public class BCAPAT1 {
    public static void main(String[] args) {
        int n=5;
        printPattern1(n);
        printPattern2(n);
        printPattern3(n);
        printPattern4(n);
        printPattern5(n);
        printPattern6(n);
        printPattern7(n);
        printPattern8(n);
        printPattern9(n);
        printPattern10(n);
        
    }

    // Print Square pattern
        public static void printPattern1(int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print("*");
                }
                 System.out.println(""); // After the inner loop finishes, System.out.println("") is called to move the cursor to the next line, creating a new row in the triangle.
            }
        }

             // Right Angle triangle 
            public static void printPattern2(int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){

    // The condition j <= i states that the inner loop should continue executing as long as the value of j is less than or equal to the value of i.
// Let's take an example to illustrate the behavior of the condition:

// When i is 0 (the first row), the condition j <= i is true only when j is 0. Therefore, the inner loop will execute once, printing a single asterisk.
// When i is 1 (the second row), the condition j <= i is true for j values 0 and 1. The inner loop will execute twice, printing two asterisks.
// When i is 2 (the third row), the condition j <= i is true for j values 0, 1, and 2. The inner loop will execute three times, printing three asterisks.
// This pattern continues until i reaches n-1, where n is the total number of rows specified as a parameter to the printPattern2 method.
// The inner loop will execute i+1 times, printing i+1 asterisks in each row.
                    System.out.print("* ");
                }
                 System.out.println("");
        }
    } // numbers in form of Right Angle Triangle

    public static void printPattern3(int n){
            for(int i=1;i<=n;i++){

//In the code snippet for(int i = 1; i <= n; i++), the condition i <= n is used as the termination condition for the outer for loop.
// Here's an explanation of what i <= n means:
// The variable i is the loop counter for the outer loop. It starts from 1 and increments by 1 in each iteration.
// The variable n represents the total number of rows in the pattern.
// The condition i <= n states that the outer loop should continue executing as long as the value of i is less than or equal to the value of n.
// Let's take an example to illustrate the behavior of the condition:
// If n is 5, the outer loop will execute when i takes the values 1, 2, 3, 4, and 5.

                for(int j=1;j<=i;j++){
                    System.out.print(j+ " ");
                }
                 System.out.println("");
        }
    }

    // numbers in line as R0IGHT ANGLE
     public static void printPattern4(int n){
            for(int i=1;i<=n;i++){
                
//In the code snippet for(int i = 1; i <= n; i++), the condition i <= n is used as the termination condition for the outer for loop.
// Here's an explanation of what i <= n means:
// The variable i is the loop counter for the outer loop. It starts from 1 and increments by 1 in each iteration.
// The variable n represents the total number of rows in the pattern.
// The condition i <= n states that the outer loop should continue executing as long as the value of i is less than or equal to the value of n.
// Let's take an example to illustrate the behavior of the condition:
// If n is 5, the outer loop will execute when i takes the values 1, 2, 3, 4, and 5.

                for(int j=1;j<=i;j++){
                    System.out.print(i+ " ");
                }
                 System.out.println("");
        }
    }

    // inverted star pattern
     public static void printPattern5(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("* ");
                }
                 System.out.println("");
        }

    }
    // Another Aproach for inverted star
     public static void printPattern6(int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n-i;j++){
                    System.out.print("* ");
                }
                 System.out.println("");
        }
    }
     public static void printPattern7(int n){
            for(int i=1;i<n;i++){
                for(int j=i;j<=n;j++){
                    System.out.print("* ");
                }
                 System.out.println("");
        }
}
 
 // inverted numbers in form of Right Angle Triangle

    public static void printPattern8(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print(j+ " ");
                }
                 System.out.println("");
        }
    }
   // Triangle pattern
 public static void printPattern9(int n){
        for(int i=0;i<n;i++){ //outer loop
            for(int j=0;j<n-i-1;j++){ // print space
                System.out.print(" ");
            }
                for(int j=0;j<(2*i)+1;j++){ // print star
                    System.out.print( " *");
                }
                 for(int j=0;j<n-i-1;j++){ // print space
                System.out.print(" ");
            }

                 System.out.println(" ");
        }
    }
// Inverted Triangle pattern

public static void printPattern10(int n){
        for(int i=0;i<n;i++){ //outer loop
            for(int j=0;j<i;j++){ // print space
                System.out.print(" ");
            }
                for(int j=0;j<(2*n)-((2*i)+1 );j++){ // print star
                    System.out.print( " *");
                }
                 for(int j=0;j<i;j++){ // print space
                System.out.print(" ");
            }

                 System.out.println(" ");
        }
}
}