

// ONLY FOR N>=2
public class Funprime {
    // PRINT TRUE OR FALSE TO CHECK NUMBER IS PRIME OR NOT 
    // public static boolean isprime(int n){
        // CORNER CASES
    //     boolean isPrime = true;  // only for n>=2
    //     for(int i=2;i<=n-1;i++){
    //         if(n % i  == 0){     // completely dividing then non prime
    //            isPrime = false;
    //            return isPrime;   // if condition is false 
    //                              // break; to get out of loop

    //         }

    //     }
    //     return isPrime;
    // }
// we are optimizing loop 
    
    // public static boolean isPrime(int n){
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i=2;i<=Math.sqrt(n);i++){
    //         if(n % i==0){
    //             return false;
    //         }
    //     }
    //     return true;

    // }
    
      

        // public static void main(String args[]){
        //     System.out.println(isPrime(77));
        // }
        // private static boolean isPrimes(int i) {
        //     return false;
        // }
///// PRINT THE PRIMES IN RANGE FROM 2 TO N ////
        private static boolean isPrime(int i) {
            return false;
        }    
        
    
    public static void primesInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){ // if true
                System.out.println(i+" ");

            }
        }
        System.out.println();
    }
 
    public static void main(String args[]){
        primesInRange(20);  // 2 to 20
       
    }
}