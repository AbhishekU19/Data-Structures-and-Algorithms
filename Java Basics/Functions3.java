public class Functions3 {
    public static void swap(int a,int b){
       // JAVA IS ALWAYS CALL BY VALUE CHANGES IN FUNCTIONS ARE LIMITED TO FUNCTIONS AND MAIN FUNCTIONS ALWAYS USE IT'S ORIGINAL VALUE
       // IN JAVA ORIGINAL VALUE IS NOT PASS THE COPY OF ORIGINAL VALUE IS PASSED

        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public static void main(String args[]){
        // SWAP VALUE CHANGES
        int a=5;
        int b=10;

        //swap
        int temp=a;
        a=b;
        b=temp;
        swap(a,b);
        System.out.println("a="+a);
        System.out.println("b="+b);
       

    
    


    }
    
}
