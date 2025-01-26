public class Rec1 {

    // Print numbers in decreasing order from n to 1 using recursion
    public static void printDec(int n) {
        if(n == 1){  // Base case: when n is 1, print it and return
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");  // Print current number
        printDec(n - 1);  // Recursive call for n-1
    }

    // Print numbers in increasing order from 1 to n using recursion
    public static void printInc(int n){
        if(n == 1){  // Base case: when n is 1, print it and return
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);  // Recursive call for n-1
        System.out.print(n + " ");  // Print current number after recursive call
    }

    // Calculate factorial of a number n using recursion
    public static int fact(int n){
        if(n == 0){  // Base case: factorial of 0 is 1
            return 1;
        }
        int fnm1 = fact(n - 1);  // Recursive call for factorial of n-1
        int fn = n * fnm1;  // Multiply current n with factorial of n-1
        return fn;
    }

    // Calculate the sum of first n natural numbers using recursion
    public static int calcSum(int n){
        if(n == 1){  // Base case: sum of first 1 number is 1
            return 1;
        }
        int Snm1 = calcSum(n - 1);  // Recursive call for sum of first n-1 numbers
        int Sn = n + Snm1;  // Add current number n to sum of n-1 numbers
        return Sn;
    }

    // Check if the array is sorted or not using recursion
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length - 1){  // Base case: if we reach the last element, the array is sorted
            return true;
        }
        if(arr[i] > arr[i + 1]){  // If current element is greater than the next one, array is not sorted
            return false;
        }
        return isSorted(arr, i + 1);  // Recursive call for the next element
    }

    // Find the first occurrence of a key in an array using recursion
    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){  // Base case: if index reaches the end of the array, return -1 (not found)
            return -1;
        }
        if(arr[i] == key){  // If the current element matches the key, return its index
            return i;
        }
        return firstOccurence(arr, key, i + 1);  // Recursive call for the next element
    }

    // Find the last occurrence of a key in an array using recursion
    public static int LastOccurence(int arr[], int key, int i){
        if(i == arr.length){  // Base case: if index reaches the end of the array, return -1 (not found)
            return -1;
        }
        int isFound = LastOccurence(arr, key, i + 1);  // Recursive call for the next element
        if(isFound == -1 && arr[i] == key){  // If key is found at current index after all recursive calls
            return i;
        }
        return isFound;  // Return the index of last occurrence
    }

    // Calculate the power of x raised to n (x^n) using recursion
    public static int power(int x, int n) {
        if(n == 0){  // Base case: any number raised to 0 is 1
            return 1;
        }
        return x * power(x, n - 1);  // Recursive call for x^(n-1) and multiply it by x
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1, 100, 2, 4, 5, 6, 7};

        // Uncomment the following lines to test each function

          printDec(n);  // Prints numbers in decreasing order from n to 1
          printInc(n);  // Prints numbers in increasing order from 1 to n
           System.out.println(fact(n));  // Calculates and prints factorial of n
           System.out.println(calcSum(n));  // Calculates and prints sum of first n natural numbers
           System.out.println(isSorted(arr, 0));  // Checks if the array is sorted
           System.out.println(firstOccurence(arr, 5, 0));  // Finds first occurrence of 5 in the array
           System.out.println(LastOccurence(arr, 5, 0));  // Finds last occurrence of 5 in the array
           System.out.println(power(2, 10));  // Calculates 2 raised to the power of 10
    }
}
