public class SubArrays {
    public static void printSunArrays(int numbers[]){
       int ts=0;
        for(int i=0;i<numbers.length; i++){
            int start =i;
            for(int j=i;j<numbers.length; j++){ // j+=i if want to print single element in array
                int end =j;
                for(int k=start;k<=end;k++){ // loop for print
                    System.out.print(numbers[k] +" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays = " + ts);
    }
    public static void main(String args[]){
    int numbers[]=  {2,4,6,8,10};
    printSunArrays(numbers);
    }
}
