public class OPPS6 {


    public static void main(String[] args) {
       Horse h= new Horse();
       System.out.println(h.color);
      System.out.println("Animal constructor is called"); 
    }
    
}
class Animal {
    String color;
    Animal(){
       System.out.println("Animal constructor is called");
    }
}
class Horse extends Animal {
    Horse(){ super();
        super.color="brown";
       
        System.out.println("horse constructor is called");
    }
}