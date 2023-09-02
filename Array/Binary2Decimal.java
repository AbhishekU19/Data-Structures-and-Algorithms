public class Binary2Decimal {
    public static void B2D(int B2D){
        int pow = 0;
        int decNum = 0;

        while(B2D > 0){
            int lastDigit = B2D %10;
            decNum = decNum + (lastDigit *(int) Math.pow(2,pow)); // int typecast
        pow++;
        B2D = B2D/10;

       
        }
        System.out.println("decimal of " + B2D + " = "+ decNum);


    }
    

public static void main(String[] args) {
    B2D(101);            // 2 to 20
}
}


