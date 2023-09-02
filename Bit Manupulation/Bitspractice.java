public class Bitspractice {
    
    //Idea is to use XOR operataors to swap two numbers by their property x^x=0
    //  public static void main(String[] args) {
    //     int x=3, y=4;
    //     System.out.println("Before swap: x =  " +  x  + " and y = " + y);
    // // SWAP USING XOR
    // x=x^y;
    // y=x^y;
    // x=x^y;
    // System.out.println("After swap: x= " + x + " and y = " + y );
    /// }

    // The expression -~x will add 1 to an integer x. We know that that to get negative of a number, invert its bits and add to it(Remember negative numbers are stored in 2's complement form)
     // -x=~x+1
     // -~x= x+1(By replacing x and ~x)
     // 
    // public static void main(String[] args) {
    //     int x=6;
    //     System.out.println(x+" + " + 1 + " is " + -~x);
    //     x= -4; 
    //     System.out.println(x+ " + " + 1 + " is " + -~x);
    //     x=0;
    //     System.out.println(x+ " + " + 1 + " is " + -~x);

    // }
    public static void main(String[] args) {
        // convert uppercase charaters to lowercase
        for(char ch='A'; ch<= 'z'; ch++){
            System.out.println((char) (ch | ' '));
            // prints abcdefghijklmnopqrstuvwxyz
        }
    }
}
