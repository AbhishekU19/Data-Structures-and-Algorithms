import java.util.*;

import java.util.Arrays;

public class Arrays1basic {

    // 1. Array Declaration and Initialization
    public static void declareArray() {
        // Array declaration with size
        int[] arr = new int[5]; // Default values are 0 for int

        // Array initialization at the time of declaration
        int[] arr2 = {1, 2, 3, 4, 5};

        // Array declaration and later initialization
        int[] arr3;
        arr3 = new int[]{10, 20, 30, 40, 50};

        // Print arrays
        System.out.println("Array 1 (default values): " + Arrays.toString(arr));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Array 3: " + Arrays.toString(arr3));
    }

    // 2. Access elements from the array
    public static void accessArray(int[] arr) {
        System.out.println("Element at index 0: " + arr[0]);
        System.out.println("Element at index 2: " + arr[2]);
    }

    // 3. Update elements in an array
    public static void updateElement(int[] arr, int index, int value) {
        if (index >= 0 && index < arr.length) {
            arr[index] = value;
            System.out.println("Updated array: " + Arrays.toString(arr));
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    // 4. Insert an element (new array since fixed size)
    public static int[] insertElement(int[] arr, int index, int value) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }

    // 5. Delete an element (new array since fixed size)
    public static int[] deleteElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    // 6. Search an element (Linear Search)
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return index of the element if found
            }
        }
        return -1; // Return -1 if not found
    }

    // 7. Binary Search (Array must be sorted)
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid; // Element found
            }
            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Element not found
    }

    // 8. Reverse the array
    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    // 9. Sorting an array (Bubble Sort)
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array (Bubble Sort): " + Arrays.toString(arr));
    }

    // 10. Find the maximum element in the array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // 11. Find the minimum element in the array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // 12. Advanced: Rotate the array to the right by 'k' positions
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n
        reverse(arr, 0, n - 1); // Reverse the whole array
        reverse(arr, 0, k - 1); // Reverse first k elements
        reverse(arr, k, n - 1); // Reverse the remaining elements
        System.out.println("Array after rotating right by " + k + " positions: " + Arrays.toString(arr));
    }

    // Helper method to reverse a portion of an array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {10, 20, 30, 40, 50};

        // 1. Array declaration and initialization
        declareArray();

        // 2. Accessing elements
        accessArray(arr);

        // 3. Updating elements
        updateElement(arr, 2, 100);

        // 4. Inserting an element
        arr = insertElement(arr, 3, 60);
        System.out.println("Array after insertion: " + Arrays.toString(arr));

        // 5. Deleting an element
        arr = deleteElement(arr, 2);
        System.out.println("Array after deletion: " + Arrays.toString(arr));

        // 6. Searching for an element (Linear search)
        int index = linearSearch(arr, 60);
        System.out.println("Element 60 found at index: " + index);

        // 7. Binary search (requires sorted array)
        bubbleSort(arr);
        index = binarySearch(arr, 60);
        System.out.println("Element 60 found at index (Binary search): " + index);

        // 8. Reversing the array
        reverseArray(arr);

        // 9. Sorting the array
        bubbleSort(arr);

        // 10. Finding maximum and minimum elements
        System.out.println("Maximum element: " + findMax(arr));
        System.out.println("Minimum element: " + findMin(arr));

        // 12. Rotating the array to the right by 2 positions
        rotateRight(arr, 2);
    }
}


/**
public class Arrays1basic {
    datatype arrayname[]=new datatype[size];
public static void main(String[] args) {
    int marks [] = new int[50];
    int numbers[] ={1,2,3};
    int moreNumbers[] = {4,5,6};
    String fruits[] = {"apple","mango","orange"};
    int marks[] = new int[100];
    Scanner sc = new Scanner(System.in);
   System.out.println("length of array = " + marks.length); // CHECK LENGTH OF AN ARRAY (DOT OPERATOR)
    int phy;
    phy = sc.nextInt();
    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();

    System.out.println("phy : "+ marks[0]);
    System.out.println("chem : "+ marks[1]);
    System.out.println("math : "+ marks[2]);

    marks[2] = 100;            // UPDATE ARRAY(+,-,*,/)
    marks[2] = marks[2]+1;
    System.out.println("math : "+ marks[2]);
    
    int percentage = (marks[0] + marks[1] + marks[2])/3;
    System.out.println("percentage = " + percentage + "%");
    sc.close();
       
    }   
}
**/
