public class AAA{
    public static void main(String[] args) {
        int number[]={1,2,1,4};
        for(int i=0;i<number.length-1;i++){
           int num1=number[i];
        
        for(int j=i+1; j<number.length; j++){
            int num2=number[j];
        
        if( num1 == num2){
            System.out.println("Has double number");
        }
    }
  }
 }
}
        
//New start
// import java.io.*;

// class Array{
//     public static void main(String[] args) { 
//         String names[]={"suraj","ram","aniket"};
//         String name="aniket";

//         for(int i=0;i< names.length; i++){
//                 if(names[i].equals(name)){
//                     System.out.print("name is "+ name);
//                 }
//             }
//         }
//     }

// public class AAA {
//     public class LinearSearchExample{    
//         public static int linearSearch(int[] arr, int key){    
//                 for(int i=0;i<arr.length;i++){    
//                     if(arr[i] == key){    
//                         return i;    
//                     }    
//                 }    
//                 return -1;    
//             }    
//             public static void main(String args[]){    
//                 int[] a1= {10,20,30,50,70,90};    
//                 int key = 50;    
//                 System.out.println(key+" is found at index: "+linearSearch(a1, key));    
//             }    
//         }    
    
//     }
          
    
        
    
        

    

