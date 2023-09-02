public class MaxsubArray2 { // PREFIX ARRAY OPTIMISED SOLIUTION
    public static void MaxSunArrays(int numbers[]){
        int Currentsum=0;
        int Maxsum= Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        // Calculate prefix Array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
         for(int i=0;i<numbers.length; i++){
             int start =i;
             for(int j=i;j<numbers.length; j++){ // j+=i if want to print single element in array
                
                int end=j;
                Currentsum =start ==0 ?prefix[end]:prefix[end] - prefix[start -1];

                //  for(int k=start;k<=end;k++){ // loop for print
                //    // subarray sum
                //    Currentsum += numbers[k];
                //  }
                 //System.out.println(Currentsum);
                 if(Maxsum < Currentsum){
                    Maxsum = Currentsum;

                 }                
             }  
         }
         System.out.println("Max sum = " + Maxsum);
     }
     public static void kadanes(int numbers[]){ // Print zero instead of negative numbers
        int ms= Integer.MIN_VALUE;
        int cs=0;
        for(int i=0; i<numbers.length; i++){
            cs= cs+ numbers[i];
            if(cs <0){
                cs=0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("our max subarray sum is: " +ms);
     }       
     
     public static void main(String args[]){
     //int numbers[]=  {1,-2,6,-1,3};
     int numbers[]=  {-2,-3,4,-1,-2,1,5,-3};
     MaxSunArrays(numbers);
     
     }
    
}
