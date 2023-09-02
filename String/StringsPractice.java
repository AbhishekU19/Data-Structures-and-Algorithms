public class StringsPractice {
    public static boolean isVowel(char ch){
        ch=Character.toUpperCase(ch);
        return(ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U');

    }
    public static int countVowels(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(isVowel(str.charAt(i)))
            count++; // TC=O(n) where n is length of string
        }
            return count;
        
    }
    public static void main(String[] args) {
        String str="abc de";
        System.out.println(countVowels(str));
    }
}
