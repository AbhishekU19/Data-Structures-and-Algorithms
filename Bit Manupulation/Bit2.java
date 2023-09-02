public class Bit2 {
    public static void OddEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
        // even number
            System.out.println("Even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    //GET ith BIT
    public static int GetithBit(int n, int i){
        int bitMask=1<<i;
        if((n& bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    // SET I TH BIT
    public static int SetithBit(int n, int i){
        int bitMask=1<<i;
        return n | bitMask;
    }
    // CLAER I TH BIT
    public static int clearIthBit(int n,int i){
        int bitmask= ~(1<<i);
        return n & bitmask;
    }
    // UPDATE I TH BIT
    public static int updateIthBit(int n,int i,int newBit) {
    //     if(newBit==0){ 
    //     return clearIthBit(n,i);   
    // }
    // else{
    //   return SetithBit(n, i);
    // }
    n=clearIthBit(n,i);
    int BitMask=newBit<<i;
    return n | BitMask;


    }
    public static int clearTthBits(int n, int i) {
        int bitMask=(~0)<<i;
        return  n & bitMask;
        
    }
    public static int clearBitsinrange(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int BitMask=a | b;
        return n & BitMask;
    }
    public static boolean isPowerofTwo(int n) {
        return (n&(n-1))== 0;  
    }
    public static int countSetBit(int n) {
        int count=0;
        while(n>0){ 
        if((n&1)!=0) {
            count++;
        }  
        n=n>>1;
    }
    return count;
    }
    public static int fastExponentaition(int a, int n) {
      int ans=1;
        while(n>0){ 
        if((n&1) !=0) { //  Check LSB
            ans = ans * a;
        }  
         a=a*a;
         n= n>>1;
    }
    return ans;

}
        public static void main(String[] args) {
              // OddEven(3);
             // OddEven(11);
            // OddEven(14);
           // System.out.println(SetithBit(10, 1));
          //System.out.println(clearIthBit(10, 1));
         // System.out.println(updateIthBit(10, 2, 1));
        //System.out.println(clearTthBits(15, 2));
       //System.out.println(clearBitsinrange(10, 2, 4));
      // System.out.println(isPowerofTwo(8));
     //System.out.println(countSetBit(10));
     System.out.println(fastExponentaition(3, 5));
      
    }
    
    }

