public class Arrays3 {
    public static int linearsearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i; // return if we found our key
            }
        }
        return -1; // key does not exist 
    }
    public static void main(String[] args) {
        int numbers[] ={2,4,6,8,10,12,14,16};
        //String menu[] = {"vadapav","pav bhaji","samosa","dryfruits"};
       
        int key =16;
        int index = linearsearch(numbers,key); 
        if(index == -1){
            System.out.println("Not found");
        }else {
            System.out.println("key is at index : " +index);
        }
    }        
}
