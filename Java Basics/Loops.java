
import java.util.Scanner;
public class Loops {
    public static void main(String args[]){
        // PRINT REVERSE OF A NUMBER
        int n =1089567;
        while(n>0){
            int Lastdigit = n % 10;
            
            System.out.print(Lastdigit + "");
            n = n / 10; // n/=10

     // Reverse the given number

        int O = 10899;
        int rev = 0;


        while(O>0){
            int lastdigit = O % 10;
            rev = (rev*10) + lastdigit;
             O = O/10;
        }
        System.out.println(rev);

        }
        //FOR LOOP PRINT SQUARE PATTERN
        
        for(int line=1; line<=4; line++) {
            System.out.println("*********");

        // PRINT SQUARE PATTERN


        int lines=1;
        while(lines<=4){
            System.out.println("*********");
            lines++;
        
            // FOR LOOP
        }
        }
        for(int i=1;i<=5;i++) {
            System.out.println("Hello World");
        }
        //DO WHILE LOOP

        int counter = 1;
        do{
            System.out.println("Hello World");
            counter++;
        }while(counter <= 10);

        // SUM OF FIRST N NATURAL NUMBERS.

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int sum = 0;
        int i=1;
        while(i<=m){

            sum += i;
            i++;
            sc.close();
        }
        System.out.println("sum is :" +sum);

    }
}