
// INTEGER IS POSITIVE OR NOT
import java.util.*;
//import java.util.*;
public class Loopspractice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddsum = 0 ;
        do{
            System.out.print("Enter a number: ");
            number = sc.nextInt();

            if(number % 2== 0 ){
                evenSum += number;

            }else{
                oddsum += number;

            }
            System.out.print("Do you want to continue? Press 1 for Yes or 0 for No ");

            choice=sc.nextInt();
        }
            while(choice==1);{
                System.out.println("Sum of even number: "+ evenSum);
                System.out.println("Sum of odd numbers: "+ oddsum);
                sc.close();
            }

        }
 
        ////MULTIPLICATIOM TABLE input given by user
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();    {  
            
         // int N=5; Execute without output
        for(int i=1; i<=10; i++){
            System.out.println( N + "*" +i+ "="+ N*i);
          sc.close();
        }
    }




  //FACTORIAL OF GIVEN NUMBER

       {  
        Scanner sc = new Scanner(System.in);
       
         int num; // TO HOLD NUMBER
         int fact =1;// TO HOLD FACTORIAL
         System.out.print("Enter a positive integer");
         num =  sc.nextInt();
        
         for(int i=1; i<=num; i++){
            fact *= i;
         }
         System.out.println("Factorial:"+fact);
         sc.close();

        }
    }

