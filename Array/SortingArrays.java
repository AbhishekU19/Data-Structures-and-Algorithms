//import java.util.Collections;
//import java.util.Arrays;
 //BUBBLE SORT
  
public class SortingArrays { //BUBBLE SORT
    public static void BubbleSort(Integer arr[]){  
        
    for(int turn=0;turn<arr.length-1;turn++){
        // intialize variable swap=0;
        for(int j=0;j<arr.length-1-turn;j++){
        if(arr[j]>arr[j+1]){
            // SWAP
            int temp =arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp; // swap++ = for check is array sorted or not// if after one iteration your swap does not increase by one it means array is already sorted

        }
        }
    }
}
public static void printarr(int arr[]) {
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }
    System.out.println();
    
}
public static void Selectionsort(Integer arr[]) {
    for(int i=0; i<arr.length-1; i++){
        int minPos=i;
        for(int j=i+1; j<arr.length; j++){
            if(arr[minPos]>arr[j]){
                minPos=j;
            }
        }
        //swap
        int temp=arr[minPos];
        arr[minPos]= arr[i];
        arr[i]  =    temp;
    }
    
}
public static void insertionsort(Integer arr[]) {
    for(int i=1;i<arr.length; i++){
        int curr= arr[i] ;
        int prev =i-1;
        /// finding out the correct Position to Insert
        while(prev>=0 && arr[prev]>curr){
            arr[prev+1] = arr[prev];
            prev--;
        }
        // insertion
        arr[prev+1] = curr;
    }
    
}
// public static int compare(int a,int b){
//     // a <  b;
//     // a == b;
//     // a >  b;
//     return a-b;
//     return b-a; reverse logic inbuilt sorting
// }
public static void countingSort(int arr[]){
    int largest = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
        largest = Math.max(largest, arr[i]);
    }
    int count[] = new int[largest+1];
    for(int i=0; i<arr.length; i++){
        count[arr[i]]++;
    }
    // SORTING
    int j=0;
    for(int i=0; i<count.length; i++){
        while (count[i] > 0) {
            arr[j] = i;
            j++;
        
            count[i]--;

    }
}
}

public static void main(String[] args) {
    int arr[] ={5,4,1,3,2,6};
    //BubbleSort(arr);
    //Selectionsort(arr);
    //insertionsort(arr);
    //Arrays.sort(arr,0,3); //INBUILT SORTING 
    //Arrays.sort(arr, Collections.reverseOrder()); // COMPARATOR used to compare 
    countingSort(arr);
    printarr(arr);
  
   
} 
}
