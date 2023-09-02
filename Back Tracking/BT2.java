public class BT2 {
    //FIND SUBSETETS
    public static void findSubsets(String str, String ans, int i){
        // base case
        if(i==str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            } else {
                    System.out.println(ans);
                }
                return;
            }
            // Yes Choice
            findSubsets(str, ans+str.charAt(i), i+1);
           // No choice
           findSubsets(str, ans, i+1);
        }
   //// FIND PERMUTATIONS
        public static void findPermutations(String str,String ans){
            //Base case
            if(str.length()== 0){
                System.out.println(ans);
                return;
            }
            // recursion TC=O(n*n!)
            for(int i=0;i<str.length();i++){
                char curr=str.charAt(i);
                String Newstr=str.substring(0,i)+ str.substring(i+1);
                findPermutations(Newstr, ans+curr);
            }
        }
        public static void main(String[] args) {
            String str="abcd";
          //  findSubsets(str, "", 0);   
            findPermutations(str, "");
        }
    }
    

