public class Maxsubarray {
    public static void MaxSunArrays(int numbers[]){
        int Currentsum=0;
        int Maxsum= Integer.MIN_VALUE;
         for(int i=0;i<numbers.length; i++){
             int start =i;
             for(int j=i;j<numbers.length; j++){ // j+=i if want to print single element in array
                
                int end =j;
                Currentsum =0;

                 for(int k=start;k<=end;k++){ // loop for print
                   // subarray sum
                   Currentsum += numbers[k];
                 }
                 System.out.println(Currentsum);
                 if(Maxsum < Currentsum){
                    Maxsum = Currentsum;

                 }
                 
                
             }
            
         }
         System.out.println("Max sum = " + Maxsum);
     }
     public static void main(String args[]){
     int numbers[]=  {1,-2,6,-1,3};
     MaxSunArrays(numbers);
     
     }
    
}
