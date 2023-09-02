public class OPPS2 {
/// single inheritance 
    public static void main(String[] args) {
        fish dolphin=new fish();
        dolphin.eat();
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
        Bird parraot= new Bird();
        parraot.fly();
        System.out.println(parraot);
        
    }

}
    class Animal{
        String color;
        void eat(){
            System.out.println("eats");
        }
        void breathe()
        {
            System.out.println("Breathes");
        }
    }
// multilevel inheritance
    class Mammal extends Animal{
        int legs;
        void walk(){
            System.out.println("Walks");
        }
    } // Hierarchial inheritance
    class fish extends Animal{
       
        void swim(){
            System.out.println("swims");
        }
    }
    class Bird extends Animal{
        
        void fly(){
            System.out.println("fly");
        }
    }

    class Dog extends Mammal{
        String Breed;
    }
  // Derived class/ subclass
    class Fish extends Animal { // extends means functions or properties of animal will be there in fish
      int fins;
      void swim(){
        System.out.println("swims in water");
      }  

    }
    

