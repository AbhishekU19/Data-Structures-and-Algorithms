 import java.util.ArrayList;

// Stack using Arraylist
public class Stack {
    static class Stack2B {
        static ArrayList<Integer> list = new ArrayList<>();
        
        public static boolean isEmpty() {
            return list.size() == 0;
        }
        
        //push
        public static void push(int data) {
            list.add(data);
        }
        
        //pop
        public static int pop() {
            if(isEmpty()){
                return-1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }
        
        //peek
        public static int peek() {
            if(isEmpty()){
                return-1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

public class StackB{
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }  
    //push
    public static void push(int data){
        list.add(data);
    }
    //pop
    public static int pop(){
        int top =list.get(list.size() -1);
        list.remove(list.size()-1);
        return top;   
    }
    //peek
    public static int peek(){
        return list.get(list.size()-1){
        }
    }
public class LL{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.data=null;
        }
    }
    static class StackLL{
        static Node head =null;
        public static boolean isEmpty(){
            return head == null;
        }
    }
    public static void push(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next=head;
        head= newNode;

    }
    public static int pop(){
        if(isEmpty()){
            return -1;
        }
    }
    int static int peek(){
        if(isEmpty()){
            return -1;

        }
        return head.data;
    }
}
    public static void main(String[] args) {
        Stacks s =new Stack();
        // Stack<Integer> S= new Stack<>(); // Using Java collection Framework
        s.push(1);
        s.push(2);
        s.push(3);

        while(s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }  
}

          
    
                
