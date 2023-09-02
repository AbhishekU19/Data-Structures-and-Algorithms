import java.util.*;
public class Stack2 {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
       pushAtBottom(s, data);
       s.push(top);


    }
    public static void reverseStack(Stack<Integer>s){
        if(s.empty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
   
    public static void printStack(Stack<Integer> s) {
    Stack<Integer> tempStack = new Stack<>();
    while (!s.isEmpty()) {
        tempStack.push(s.pop());
    }
    while (!tempStack.isEmpty()) {
        System.out.println(tempStack.pop());
    }
}
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);//3,2,1
        reverseStack(s);
        printStack(s); //1,2,3
        // pushAtBottom(s,4);
        // while(!s.isEmpty()){
        // System.out.println(s.pop());
        }
    }

}