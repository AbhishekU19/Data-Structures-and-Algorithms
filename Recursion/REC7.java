public class REC7 {

// SORTED  AND ROTATED ARRAY SEARCH

    public static int search(int arr[],int tar, int si, int ei){
        if(si>ei){ //base case
            return -1;
        }
        // kaam,work
        int mid= si+(ei-si/2);// (si+ei)/2

        // case found 
        if(arr[mid]==tar){
            return mid;
        }
        // mid on L1
        if(arr[si]<=arr[mid]){
            // case a: left on l1
            if(arr[si]<= tar && tar <= arr[mid]){
                return search(arr,tar,si,mid-1);
            }else{
                // case b: Right on l1
                return search(arr,tar,mid+1,ei);
            }
        }
        // mid of l2
        else {
            // case d: left
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            } else{
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] ={4,5,6,7,0,1,2};
        int target=0;// output-> 4
        int tarIdx= search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }   
}
 // code for adding array?

 


