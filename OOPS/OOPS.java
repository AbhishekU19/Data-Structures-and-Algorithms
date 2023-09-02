public class OOPS {

// class= Group of these entities
    // Objects= Entities in real world
    // File name and class name will be always same and starting with capital letter and will start functions with lowercase letters
public static void main(String[] args) {
    // Ideally our function should be public as well as static
    // public = keyword
    // static = access specifier
    // void   = return type of main function.

//     Pen p1= new Pen();  // created a pen object called p1
//     p1.setColor("Blue");  // If we want to access property or function of an object we use Dot operator
//     System.out.println(p1.color);
//     p1.setTip(5);
//     System.out.println(p1.tip);
//     p1.setColor("Red");
//     System.out.println(p1.color);
//     BankAccount myAc=new BankAccount();
//     myAc.username=" AbhishekU19";
//     myAc.setPassword("abcdfeds");// you can not access but you can change the password
// }
// }
// GETTERS AND SETTERS

Pen p1= new Pen();  // created a pen object called p1
    p1.setColor("Blue");  // If we want to access property or function of an object we use Dot operator
    System.out.println(p1.getColor());
    p1.setTip(5);
    System.out.println(p1.getTip());
    p1.setColor("Red");
    System.out.println(p1.getColor());
    // BankAccount myAc = new BankAccount();
    // myAc.username=" AbhishekU19";
    // myAc.setPassword("abcdfeds");// you can not access but you can change the password
}
}

// Access modifiers = public,private,default,protected
// class BankAccount{
//     public String username;
//     private String password; 
//     public void setPassword(String pwd){
//         password=pwd;
//     }
// }
class Pen {

    // String color;
    //  int tip;

     private String color;
     private int tip;
    String getColor() {
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
     void setColor(String newColor) {
       this.color= newColor;
        // color= newColor;
     }
     void setTip(int tip) {
      this.tip = tip;
        // tip = newTip;
     }
}

class Student {
    String name;
    int age;
    float percentage;

void calcPercentage(int phy, int chem, int math) {
  percentage = (phy + chem + math)/3;  
}
}
