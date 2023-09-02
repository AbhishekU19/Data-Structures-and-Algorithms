public class Strings3 {
    // SUBSTRING FUNCTIONS
    public static String substring(String str, int si, int ei) {
        String substr= "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str="Helloworld";
       // System.out.println(substring(str,0,5));
        System.out.println(str.substring(0, 5));// substring functions
        String s1="Abhi";
       // String s2="Abhi";
        String s3=new String("Abhi");
        //  if(s1 == s2){
        //     System.out.println("Strings are Equal");
        //  }else {
        //     System.out.println("Strings are not Equal");
        //  }
        //  if(s1 == s3){
        //     System.out.println("Strings are Equal");
        //  }else{
        //     System.out.println("Strings are not Equal");
        //  }
        //.equals is used for only comparing values not functions or classes.
        
         if(s1.equals(s3)){
            System.out.println("Strings are Equal");
         }else{
            System.out.println("Strings are not Equal");
         }

         }
    }
    

