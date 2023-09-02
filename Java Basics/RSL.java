public class RSL {
    public int testFunction (int[] nums) {

        int finalCount = nums.length/2; for (int num : nums) {
        
        int count = 0;
        
        for (int elem : nums) {
        
        if (elem == num){ 
        
        count += 1;
        
        }
    }
        if (count > finalCount) {
        
        return num;
        
        }
    }
        
        return -1;
}

    
      public static void main(String args[]) {

//         int a = 511709 ;
        
//         int sum = 0;
        
//         while (a!= 0) {
        
//         int x = a%10;
        
//         sum += x;
        
//         a = a / 100 ;
        
//        System.out.println(sum);
    
// }
}
    
}

