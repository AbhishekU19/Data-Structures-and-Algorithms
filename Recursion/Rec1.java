
public class Rec1 {
    public static void printDec(int n) {
        if(n==1){
       System.out.print(n);
       return;
        }
        System.out.print( n +" ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n==1){
            System.out.print( n +" ");
            return;
        }
            printInc(n-1);
            System.out.print( n + " ");   
    }

    public static int fact(int n){
        if(n==0){  
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }

    // PRINT SUM OF FIRT N NATURAL NUMBERS n
    public static int calcSum(int n){
        if(n==1){
            return 1;

        }
        int Snm1=calcSum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }

    // Check id Array is Sorted or not using Recursion
     public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    // First Occurence In Array using Recursion
    public static int firstOccurence(int arr[], int key, int i){
        if(i==arr.length){ // Base Condition 
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
// Check LastOccurence in arrat using recursion

    public static int LastOccurence(int arr[], int key, int i){
        if(i==arr.length){ // Base Condition 
            return -1;
        }
        int isFound = LastOccurence(arr, key, i+1);
        if(isFound== -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    // Calculate Or Print Power of X to n
    public static  int power(int x, int n) {
        if(n==0){
         return 1;
        }

        return x* power(x,n-1);
    }
    public static void main(String[] args) {
        int n=5;
        int arr[]= {1,100,2,4,5,6,7};
        // printDec(n);
        // printInc(n);
       // System.out.println(fact(n));  
       // System.out.println(calcSum(n));  
       //  System.out.println(isSorted(arr, 3));
        System.out.println(firstOccurence(arr, 5, 0));
          //System.out.println(LastOccurence(arr, 5, 0));
         // System.out.println(power(2,10));
    } 
}
