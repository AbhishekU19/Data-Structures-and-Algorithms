public class FOverloading {
// FUNCTION OVERLOADING MEANS MULTIPLE NUMBERS WITH SAME NAME BUT DIFFERENT PARAMETERS
// FUNCTION OVERLOADING DOES NOT DEPEND ON "RETURN TYPE" IT DEPENDS ON "PARAMETERS" OR NO OF PARAMETERS
    // public static int sum(int a ,int b){
    //     return a+b;

    // }
    // // FUN TO CALCULATE SUM OF 3 NUMS
    // public static int sum(int a,int b,int c){
    //     return a+b+c;
    // }
    // public static void main(String[] args) {
        
    
    //     System.out.println(sum(3,5));
    //     System.out.println(sum(5,2,1));
    

        public static int sum(int a,int b){
            return a+b;
        }
        public static float sum(float a, float b){
            return a+b;
        }
        public static void main(String[] args) {
            
        System.out.println(sum(3,5));
        System.out.println(sum(3.2f , 4.8f));

            
        }

    
    }




