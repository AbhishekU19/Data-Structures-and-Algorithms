public class CircularLL {
    class Solution {
        static class Node {
            int data;
            Node next;
        };
        
        // Function to add a node to an empty list
        static Node addToEmpty(Node last, int data) {
            if (last != null) // if the list is not empty, return the last node
                return last;
            Node newNode = new Node(); // create a new node
            newNode.data = data; // set the data for the new node
            last = newNode; // update the last node to be the new node
            newNode.next = last; // set the next pointer of the new node to itself (since it is the only node in the list)
            return last; // return the last node (which is now the new node)
        }
        
        // Function to add a node at the beginning of a list
        static Node addFront(Node last, int data) {
            if (last == null) // if the list is empty, call the addToEmpty function
                return addToEmpty(last, data);
            Node newNode = new Node(); // create a new node
            newNode.data = data; // set the data for the new node
            newNode.next = last.next; // set the next pointer of the new node to the current first node in the list
            last.next = newNode; // set the next pointer of the last node to the new node
            return last; // return the last node (which is still the same)
        }
        
        // Function to add a node at the end of a list
        static Node addEnd(Node last, int data) {
            if (last == null) // if the list is empty, call the addToEmpty function
                return addToEmpty(last, data);
            Node newNode = new Node(); // create a new node
            newNode.data = data; // set the data for the new node
            newNode.next = last.next; // set the next pointer of the new node to the current first node in the list
            last.next = newNode; // set the next pointer of the last node to the new node
            last = newNode; // update the last node to be the new node
            return last; // return the last node (which is now the new node)
        }
        
        // Function to add a node after a given node
        static Node addAfter(Node last, int data, int item) {
            if (last == null) // if the list is empty, return null
                return null;
            Node newNode, p;
            p = last.next; // start at the first node in the list
            do {
                if (p.data == item) { // if the current node matches the given node
                    newNode = new Node(); // create a new node
                    newNode.data = data; // set the data for the new node
                    newNode.next = p.next; // set the next pointer of the new node to the node after the current node
                    p.next = newNode; // set the next pointer of the current node to the new node
                    if (p == last) // if the current node is the last node, update the last node to be the new node
                        last = newNode;
                    return last; // return the last node
                }
                p = p.next; // move to the next node in the list
            } 
             while (p != last.next);
            return p;
        }
             
        // loop until we return to the
            static Node deleteNode(Node last, int key) {
                if (last == null)
                    return null;
                if (last.data == key && last.next == last) {
                    last = null;
                    return last;
                }
                Node temp = last, d = new Node();
                if (last.data == key) {
                    while (temp.next != last) {
                        temp = temp.next;
                    }
                    temp.next = last.next;
                    last = temp.next;
                }
                while (temp.next != last && temp.next.data != key) {
                    temp = temp.next;
                }
                if (temp.next.data == key) {
                    d = temp.next;
                    temp.next = d.next;
                }
                return last;
            }
        
            static void traverse(Node last) {
                Node p;
                if (last == null) {
                    System.out.println("List is empty.");
                    return;
                }
                p = last.next;
                do {
                    System.out.print(p.data + " ");
                    p = p.next;
                } while (p != last.next);
            }
        
            public static void main(String[] args) {
                Node last = null;
                last = addToEmpty(last, 6);
                last = addEnd(last, 8);
                last = addFront(last, 2);
                last = addAfter(last, 10, 2);
                traverse(last);
                deleteNode(last, 8);
                traverse(last);
            }
        }
        
}
