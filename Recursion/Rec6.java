public class Rec6 {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i] +" ");
        }
        System.out.println();
              
    }
    public static void QuickSort(int arr[],int si,int ei) {
        if(si>=ei){
            return;
        }
        // Last Element
        int pIdx= partition(arr,si,ei);   
        QuickSort(arr, si, pIdx-1);
        QuickSort(arr, pIdx, ei);
    }
public static int partition(int arr[],int si,int ei){

    int pivot =arr[ei];
    int i= si-1;// To make place for elements smaller than pivot
    
    for(int j=si; j<ei;j++){

        if(arr[j] <= pivot){
            i++;
            // Swap
            int temp =arr[j];
            arr[j]= arr[i];
            arr[i]=temp;
        }
    }
    i++;
    // Swap
    int temp =pivot;
    arr[ei]= arr[i];
    arr[i]=temp;
    return i;
}
public static void main(String[] args) {
    int arr[]={6,3,9,8,2,5,-2};
    QuickSort(arr, 0, arr.length-1);
    printArray(arr);
}
}
