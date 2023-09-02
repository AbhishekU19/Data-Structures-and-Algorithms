
  // Remove Duplicate in a string by Recursion
public class Rec4 {
        public static void removeDuplicateLetters(String str,int idx,StringBuilder newStr, boolean map[]) {
       if(idx == str.length()){
           System.out.println(newStr);
           return;
       } 
           char currChar=str.charAt(idx);
           if(map[currChar-'a']== true){
               // duplicate
               removeDuplicateLetters(str, idx+1, newStr, map);

           } else{

          map[currChar-'a'] = true;
          removeDuplicateLetters(str, idx+1, newStr.append(currChar), map);
           }
            
        }

    // FRIENDS PAIRING PROBLEM
        public static int friendsPairing(int n){

            if(n==1 || n==2){
                return n;
            }
            //choice
            // Single
            int fnm1= friendsPairing(n-1);
            // Pair
            int fnm2=friendsPairing(n-2);
            int Pairways=(n-1)*fnm2;
            
            int totalWays= Pairways*fnm1;
            return totalWays;

            //Also we can get this Answer in single line
          //  return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);
         }
          // Print Binary String
         public static void printBinarystring(int n,int lastplace, String str){
            //base case

            if(n==0){
                System.out.println(str);
                return;
            }

            printBinarystring(n-1, 0, str+"0");

            if(lastplace ==0){
                printBinarystring(n-1, 1, str+"1");

            }
         }
        public static void main(String args[]){
          //  String str="appnnacollege";
          //  removeDuplicateLetters(str,0, new StringBuilder(""), new boolean [26]);
          //System.out.println(friendsPairing(3));
          printBinarystring(4, 1, "");
        }
    }
        
     
    

