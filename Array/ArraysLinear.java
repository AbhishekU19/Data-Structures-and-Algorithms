// public class ArraysLinear {

//     public static int linearSearch(int Array[],int key,int index){
//         for(int i=startindex;i<Array.length;i++){
//             if(Array[i]==key){
//                 return i;
//                 // System.out.println("Element found" +i);
//             }
//         }
//         return -1;
//     }
//             public static void main(String[] args) {
//                 int nums []={2,5,3,7,6};
//                 int key= 5;
//                 int i=0;
//                 int startindex = linearSearch(nums, key);
//                 if(!= -1){
//                     System.out.println("element: " + index);
//                 }else{
//                     System.out.println("Not found");
//                 }
//             }
//         }

    
    public class ArraysLinear {

    public static int linearSearch(int[] array, int key, int startIndex) {
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 3, 7, 6};
        int key = ;
        int startIndex = 0;
        
        int index = linearSearch(nums, key, startIndex);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}


