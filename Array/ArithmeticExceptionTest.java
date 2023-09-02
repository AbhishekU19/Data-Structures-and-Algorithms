public class ArithmeticExceptionTest {



public class BinomialC {
    
    private static int factorial(int r) {
        return 0;
    }
    public static int bincoeff(int n,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int bincoeff = fact_n / (fact_r * fact_nmr);
        return bincoeff;

    }

    public static void main(String args[]) {
        System.out.println(bincoeff(5,2));
        
    }

    
}
}