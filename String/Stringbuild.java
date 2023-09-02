public class Stringbuild {
   public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
          sb.append(ch);
        } 
        //abcdefghijklmnopqrstuvwxyz
          //TC = O(26)
          //O(n^2) in case if we have taken string sb+=ch O(26*n^2).
        System.out.println(sb);  // sb.length = for checking length of string.
      } 
}
