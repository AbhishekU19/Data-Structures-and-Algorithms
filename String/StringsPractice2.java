import java.util.Arrays;
public class StringsPractice2 {
    public static void main(String[] args) {
        String str1="earth";
        String str2="heart";
        // convert Srings to lowercase. why? so that we don't have to check separately for lower and uppercase
       
        str1= str1.toLowerCase();
        str2=str2.toLowerCase();

        // First check if the length are the same
       
        if(str1.length()==str2.length()){

            // convert Strings into char array
           
            char[] str1charArray=str1.toCharArray();
            char[] str2charArray=str2.toCharArray();

            
            // Sort the char array

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            // If the sort char arrays are same or identical then the strings are anagram

            boolean result = Arrays.equals(str1charArray,str2charArray);
            if(result){
                System.out.println(str1+ " and " + str2 + " are anagrams of each other");

            }else{
                System.out.println(str1+" and " + str2 + " are not anagrams of each other");

            }
        }else
             {
            System.out.println(str1+" and " + str2 + " are not anagrams of each other" );
            }
        }

    //public static void main(String args[]){
    //     String str1 ="ApnaCollege".replace("l","");
    // //replace(char oldchar, char newchar) Returns a new string resulting from replacing all occurences of oldchar in this string with newchar.
    // // replace(charsequence target, charSequence replacement) replaceses eac substring of this string that matches the literal target sequence with the specified literal replacement sequence
    // // replaceAll(string regex, string replacement) Replaces each substring of this string that matches the given regular expression with the replacement
    // // replaceFirst(String regex, String replacement) Replaces the first substring of this string that matches the given regular expression with the given replacement

    // System.out.println(str1); // Apnacoege

    }
