public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size; // Size of LL

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head; // link
        head = newNode;
    }

    // ADD LAST TO LL
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // PRINT A LL
    public void print() { // TC = O(n)
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "=>");
            temp = temp.next;
        }
        System.out.println();
    }

    // Add in the Middle of LL
    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        // i =index-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // Remove in LL Remove first
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is Empty");
            return -1;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    //Remove Last in LL
public int removeLast(){
        if (size == 0) {
            System.out.println("LL is Empty");
            return -1;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev= head;
        for(int i=0; i<size-2;i++){
            prev =prev.next;
        }
        int val= prev.next.data;// tail.data
        prev.next=null;
        tail = prev;
        size--;
        return val;
    }
    public int iterativeSearch(int key){
        Node temp= head;
        int i=0;
        while(temp.data == key) { // key Found
        if(temp.data == key){
            return i;
        }
        temp = temp.next;
        i++;


        }
        // key not found
        return -1;
    }

    // Recursive Search
public int helper(Node head, int key){ // TC=O(n)
    if(head==null){
        return -1;
    }
    if(head.data==key){
        return 0;
    }
    int index =helper(head.next, key);
    if(index == -1){
        return-1;
    }
    return index+1;
}
    public int RecursiveSearch(int key){
        return helper(head,key);
    }

    // REVERSE A LINKED LIST

    public void reverse(){ // 3 VARIABLES
        Node prev =null;
        Node curr=tail=head;
        Node next;

        while(curr != null){ // 4 STEPS
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr= next;
        }
        head=prev;

    }
    //FIND AND REMOVE NTH NODE FROM END

    public void deleteNthfromEnd(int n){
        // calculate size
        int sz=0;
        Node temp=head;
        while(temp != null){
            temp= temp.next;
            sz++;
        }
        //if you want to delete head itself then
        if(n==sz){
            head=head.next; // remove first operation
            return;
        }
        //sz-n
        
        int i=1;
        int iToFind = sz-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    // Slow Fast Approach
    public Node findMid(Node head){ //Helper
        Node slow= head;
        Node fast= head;
    while(fast != null && fast.next != null){ 
    slow = slow.next; //+1
    fast = fast.next; //+2
    }
    return slow; // Slow is My midNode
    }
// Find linked list is Palindrome or not
public boolean checkPlaindrome(){
    if(head == null /*means LL is empty */ || head.next == null /* It means LL has only one node i.E it is automatically Palindrome */){
    }
    // step1 - find mid
    Node midNode = findMid(head);
   // step2 - reverse 2nd half
   Node prev =null;
   Node curr=tail=head;
   Node next;
   while(curr != null){ // 4 STEPS
       next = curr.next;
       curr.next=prev;
       prev=curr;
       curr= next;
   }
   Node right=prev;
   Node left=head;

   // step3 - lefthalf == Righthalf
   // check if Equal
   while(right != null){
    if(left.data != right.data){
        return false;
    }
    left = left.next;
    right = right.next;
   }
   return true;
}
// Deleting Cycle in LL also Flyod's Cycle finding Algorithm
public static boolean isCycle(){
    Node slow= head;
    Node fast= head;

    while(fast != null && fast.next != null){
        slow=slow.next; //+1
        fast=fast.next; //+2
        if(slow==fast){
            return true; // cycle exists
        }
    }
    return false; // cycle dosen't exists
}
// Remove Cycle Code
public static void removeCycle() { 
    //detect cycle
    Node slow = head;
    Node fast = head;
    boolean cycle = false;
    while(fast != null && fast.next != null){
        slow =slow.next;
        fast = fast.next.next;
        if(fast == slow){
            cycle =true;
            break;
        }
    }
    if(cycle == false){
        return;
    }
 // Find Meeting Point
    slow=head;
    Node prev= null; //last Node
    while(slow!= fast){
        prev = fast;
        slow= slow.next;
        fast= fast.next;
    }  
}

// Merge Sort in LL

private Node getMid(Node head){
    Node slow= head;
    Node fast= head.next;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow; // mid Node
}

private Node merge(Node head1, Node head2) {
    Node mergeLL = new Node(-1);
    Node temp = mergeLL;

    while (head1 != null && head2 != null) {
        if (head1.data <= head2.data) {
            temp.next = head1;
            head1 = head1.next;
        } else {
            temp.next = head2;
            head2 = head2.next;
        }
        temp = temp.next;
    }

    while (head1 != null) {
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
    }

    while (head2 != null) {
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
    }

    return mergeLL.next;
}

public Node mergeSort(Node head){
    if(head == null || head.next == null){
        return head;
    }
    // Find mid
    Node mid= getMid(head);
    // left & rigth MS
    Node rightHead=mid.next;
    mid.next=null;
    Node newLeft =mergeSort(head);
    Node newRight = mergeSort(rightHead);

    //merge
    return merge(newLeft, newRight);
}
public void zigZag(){
    // find mid

    Node slow= head;
    Node fast =head.next;
    while(fast !=null && fast.next !=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    Node mid= slow;
    //reverse 2nd half
    Node curr=mid.next;
    mid.next=null;
    Node prev= null;
    Node next;

    while(curr != null){
        next= curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    Node left=head;
    Node right= prev;
    Node nextL, nextR;
    // alternate merge zig-zag merge
    while(left != null && right != null){
        nextL=left.next;
        left.next=right;
        nextR= right.next;
        right.next=nextL;

        left=nextL;
        right= nextR;
    }
}
    public static void main(String[] args) {
         LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);
        // ll.print();
        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();

        // System.out.println(ll.size);

        // System.out.println(ll.RecursiveSearch(3));
        // System.out.println(ll.RecursiveSearch(10));

        // ll.print();
        // ll.reverse();
        // ll.print();

        // ll.print();
        // ll.deleteNthfromEnd(3);

    //  ll.print();
    //  System.out.println(ll.checkPlaindrome());

    // Delete LL cycle code
    // head= new Node(1);
    // head.next= new Node(2);
    // head.next.next= new Node(3);
    // head.next.next.next= head;
    // // 1->2->3->1
    // System.out.println(isCycle());
    
    // Remove Cycle

    // head= new Node(1);
    // Node temp = new Node(2);
    // head.next= temp;
    // head.next.next=new Node(3);
    // head.next.next.next=temp;
    // // 1->2->3->2

    // System.out.println(isCycle());
    // removeCycle();
    // System.out.println(isCycle());

    // merge sort
    
    //  LinkedList ll = new LinkedList();
    //  ll.addFirst(1);
    //  ll.addFirst(2);
    //  ll.addFirst(3);
    //  ll.addFirst(4);
    //  ll.addFirst(5);
     
    //  // 5->4->3->2->1

    //  ll.print();
    //  ll.head = ll.mergeSort(ll.head);
    //  ll.print();

    // ZIGZAG LINKEDLIST

    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    
    // 1->2->3->4->5

    ll.print();
    ll.zigZag();
    ll.print();
     }
}
