import java.util.*;
public class Prime {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        // if(n==2);{
        //     System.out.println("n is Prime");
        
        
            for(int i=2;i<=n-1;i++){  // i<=math.sqrt(n); for squareroot
                if(n%i == 0){
                    isPrime = false;
                }
            }
            if(isPrime== true){
                System.out.println("n is Prime");
            
            }else{
                System.out.println("n is not Prime");
                sc.close();
    
            }
            
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime = false;
            }
        }
        if(isPrime== true){
            System.out.println("n is Prime");
        
        }else{
            System.out.println("n is not Prime");
            sc.close();

        }
        












        



    }
    
}
