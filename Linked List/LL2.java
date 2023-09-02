import java.util.LinkedList;

public class LL2 {
    public static void main(String[] args) {
        
    
    //Create
    LinkedList<Integer> ll=new LinkedList<>();

    //add
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(0);

    //0->1->2
   System.out.println(ll);
   // remove
   ll.removeFirst();
   ll.removeLast();
   System.out.println(ll);
    
}
}