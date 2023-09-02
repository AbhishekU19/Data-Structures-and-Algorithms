public class Rec3 {
    // Print x to the power of n
    public static int Optimizedpower(int a, int n){
        if(n==0){
            return 1;
        }
        int halfPowesq = Optimizedpower(a, n/2)* Optimizedpower(a, n/2);
        if(n%2 !=0){
            halfPowesq= a*halfPowesq;

        }
        return halfPowesq;

    }
    public static int tillingProblem(int n){
        if(n==0||n==1){
            return 1;
        }
        int fnm1=tillingProblem(n-1);

        int fnm2=tillingProblem(n-2);

        int totalways=fnm1+fnm2;
        return totalways;
    }

    public static void main(String[] args){
       // int a=2;
       // int n=10;
      //  System.out.println(Optimizedpower(a, n));
        System.out.println(tillingProblem(5));
    }
    
}
