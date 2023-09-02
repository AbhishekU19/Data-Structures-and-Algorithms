


public class ArraysPractice {
    public static boolean containsDuplicate(int []nums){
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }

       return false;
    }

public static void main(String[] args) {
    Solution sol= new Solution();
    int nums[] ={1,2,3};
    boolean res=sol.containsDuplicate(nums);
    System.out.println(res);
}
    

}
    

