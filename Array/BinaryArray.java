public class BinaryArray {

    public static int binarySearch(int numbers[],int key){
        int start =0, end = numbers.length-1;

        while(start<=end) {
            int mid =(start + end)/2;

            // comparisions
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){ // Right
                start = mid+1;
            }else{
                end = mid-1; // Left
            }
             
        }
        return -1; 
    }

    public static void reverse(int numbers[]){

        int first = 0, last = numbers.length-1;

        while(first<last){

            //SWAP
            int temp = numbers[last];
            numbers[last]= numbers[first];
            numbers[first]= temp;

            first++; //first index forward
            last--; // last index backward
        }
    }

    public static int binarySearch2(int numbers [], int key){
        int start=0;  int end=numbers.length-1;
        while(start<=end){
           int mid= (start +end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }else{
                mid=end-1;
            }

        }
        return -1;
    }
        public static void main(String[] args) {
            int numbers[]={2,4,6,8,10};
            int key=3;
            reverse(numbers);
            System.out.println(binarySearch2(numbers, key));
            for(int i=0; i<numbers.length; i++) { 
           
            System.out.print(numbers[i]+" ");
            // int numbers[] ={2,4,6,8,10,12,14};
            // int key = 12;
            // System.out.println("index for key is : " + binarySearch(numbers, key));
             } 
             System.out.println();
    }
    
}
    
      
     
       
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            

            
       
            
        














   
