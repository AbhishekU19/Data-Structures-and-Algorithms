import java.util.Scanner;

// SYNTAX WITH PARAMETERS METHOD

public class Functions2 {
    public static int calculatesum(int num1,int num2){// value given as input in it's definition are parameters or formal parameters
        int sum = num1 + num2; 
        return sum;
    }
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum = calculatesum(a,b); // value pass during call by function are arguments or actual parameters
        System.out.println("Sum is: "+ sum);
        
        sc.close();
    }
}

