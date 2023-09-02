import java.util.Scanner;

/// charAt method is chracter at index
public class Strings {
  private static final String str = null;
  public static void printletters(String str){
    for(int i=0; i<str.length(); i++){ // added () to length because string in java is funciion and in array it property
      System.out.print(str.charAt(i) + " ");  // charAt method is chracter at index so we can print all characters as well as all the solve
                                              // problem like print vowels, number, etc we can do it by charAt
    }
    System.out.println();
  }
    public static void main(String args[]){
        // char arr[]={'a','b','c','d'};
        // String str ="abcd";
        // String str2 = new String("xyz");
        //STRINGS ARE IMMUTABLE // created strings in java can not be change new string will be created
        Scanner sc= new Scanner(System.in);
        //String name;
        //name= sc.next(); .next means string will be store in any structure // only prints or takes first word in line
        // name=sc.nextLine();// input as whole line
        // System.out.println(name);
  
        // STRING LENGTH
        String fullName  = "Abhishek Ugalmugale";
        System.out.println(fullName.length()); //LENGTH IS FUNCTION IN STRING AND PROPERTY IN ARRAY

     // STRING CONCATENATION
        String firstName= "Abhi";
        String lastName= "Ugalmugale";
        String fullname=firstName +" " + lastName;
        System.out.println(fullname + " this is ");
        printletters(fullName);
        System.out.println(fullname.charAt(14));// character at index
      
        sc.close();

        //print all characters in string 
        for(int i=0;i<str.length();i++){
          System.out.println(charAt(i));
        }        
    }
    private static char[] charAt(int i) {
      return null;
    }
}
