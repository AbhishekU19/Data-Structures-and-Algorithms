import java.util.ArrayList;
import java.util.Collections;
// Sorting ArrayList
public class AL2 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();


        list.add(1);  
        list.add(5);
        list.add(4);
        System.out.println(list);
        Collections.sort(list);// Sorting Ascending by Default
        System.out.println(list);

        //Descending 
        Collections.sort(list,Collections.reverseOrder());
        // collections.reverseOrder are Comparators in Java which define logic of Sorting in functions we can use comparators in Objects

    }
}
