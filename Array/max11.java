public class max11 {
    public static void main(String[] args) {
        int arr[]={1378,88898,34};
        int max= arr[0];
       // System.out.println("Largest: " + max);
        // Find largest element in array?

     for(int i=1;i<arr.length;i++){
        if(arr[i]>max)
        max=arr[i];
        System.out.println("Largest: " + max );
     }
    } 
} 
