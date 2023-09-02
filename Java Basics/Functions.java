

import java.util.Scanner;



public class Functions {
    public static int printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return 3; // not compulsory in case of void but have to Write in another case of returntype
    }

    // public static void main(String args[]){
    //     printHelloWorld();       // this is function call

        public static void CalculateSum() {
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                int b=  sc.nextInt();
                int sum= a+b;
                System.out.println("Sum is :" +sum);
            }
        }
          
            public static void main(String args[]){
                CalculateSum();
                
               

            }


        


    }  


    

