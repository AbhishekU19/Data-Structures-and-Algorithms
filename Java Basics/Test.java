// import java.util.Scanner;
public class Test {
    /// hollow rectangle
    static void print_rectangle(int n, int m)
    {
        int i, j;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= m; j++)
            {
                if (i == 1 || i == n ||
                    j == 1 || j == m)           
                    System.out.print("*");           
                else
                    System.out.print(" ");           
            }
            System.out.println();
        }
      
    }
      
    // Driver program for above function
    public static void main(String args[])
    {
        int rows = 4, columns = 5;
        print_rectangle(rows, columns);
    }
   
//     public static void main(String args[]) {
       




//         Scanner sc = new Scanner(System.in);
//         int num; // TO HOLD NUMBER
//         int fact =1;// TO HOLD FACTORIAL
//         System.out.print("Enter a positive integer: ");
//         num =  sc.nextInt();
       
//         for(int i=1; i<=num; i++){
//            fact *= i;
//         }
//         System.out.println("Factorial:"+ fact);
//         sc.close();

//        }
        
//     }
// factoeial of number using function    
// public static int factorial(int n){
//    int f =1 ;
//    for(int i=1;i<=n;i++){
//        f= f*i;
//    }

//        return f; // factorial of n

// }
// public static void main(String args[]){
//    System.out.println(factorial(5));
// } 

 }