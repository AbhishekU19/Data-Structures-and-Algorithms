public class String6 {
    public static String Compress(String str) {
    String newStr="";
        for(int i=0; i<str.length()-1; i++){
        Integer count =1;
        while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
            count++;
            i++;// loops run till only string length so TC=O(n)
        }
        newStr += str.charAt(i);
        if(count >1){
            newStr+=count.toString();
        }
     }   
     return newStr;
    }
    public static void main(String[] args) {
        String str ="aaabbccdd";
        System.out.println(Compress(str));
    }
}
