import java.util.ArrayList;
import java.util.Collection;
public class AL {
    public static void main(String[] args) {
        // ArrayList is Part of JAVA cOLLECTION FRAMEWORK
        //Similar to vector in C++
        // Inbuilt Data Structure in Java
        ArrayList<Integer>  list=  new ArrayList<>();
        ArrayList<String>   list1= new ArrayList<>();
        ArrayList<Boolean>  list2= new ArrayList<>();

         ///OPERATIONS

         //ADD Operations - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
       

        list.add(1,9); // - O(n)

        //SIZE OF LIST OR SIZE METHOD
        System.out.println(list.size());

       

        // Print the ArrayList
        for(int i=0;i<list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        //PRINT REVERSE OF ARRAYLIST
        for(int i=list.size()-1; i>=0;  i--){
            System.out.println(list.get(i)+ " ");
        }
        System.out.println();

        // Max Number or Element - O(n)
        int max= Integer.MIN_VALUE;
        for(int i=0;i<list.size(); i++){
            if(max<list.get(i)){
                max= list.get(i);
                max= Math.max(max, list.get(i));
            }
        }
        System.out.println("max element = " + max);

        // SWAP TWO NUMBERS
        // public static void swap(ArrayList<Integer> list,int Index1,int Index2) {
        //     int temp=list.get(Index1);
        //     list.set(Index1, list.get(Index2));
        //     list.set(Index2, temp));  
        // int Index1=1,Index2=3;  swap index of 1 and 4
        // System.out.println(list);
        // swap(list,Index1,Index2);
        // System.out.println(list);   
        // }

        // GET OPERATION- O(1)
        int element= list.get(2);
        System.out.println(element);

        //REMOVE ELEMENT - O(2)
        list.remove(2);
        System.out.println(list);
        
        // Set Element at Index - O(n)
        list.set(2,10);
        System.out.println(list);

        //Contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));


    }
    
}
