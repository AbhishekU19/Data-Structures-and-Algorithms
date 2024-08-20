public class LinkedList {

    // Node class represents each element in the Linked List
    public static class Node {
        int data;
        Node next;

        // Constructor to initialize the node with data
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Reference to the head (first node) and tail (last node) of the Linked List
    public static Node head;
    public static Node tail;
    public static int size; // Keeps track of the size of the Linked List

    // Add a node at the beginning of the Linked List
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) { // If list is empty, head and tail will point to the same node
            head = tail = newNode;
            return;
        }

        newNode.next = head; // Link the new node to the previous head
        head = newNode; // Update head to the new node
    }

    // Add a node at the end of the Linked List
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) { // If list is empty, head and tail will point to the same node
            head = tail = newNode;
            return;
        }

        tail.next = newNode; // Link the last node to the new node
        tail = newNode; // Update tail to the new node
    }

    // Print all elements in the Linked List
    public void print() {
        if (head == null) { // If list is empty
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp = head;
        while (temp != null) { // Traverse and print each node
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Add a node at a specific index in the Linked List
    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data); // If index is 0, add at the beginning
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < index - 1) { // Traverse the list to reach the desired position
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next; // Link the new node to the next node
        temp.next = newNode; // Link the previous node to the new node
        size++;
    }

    // Remove the first node of the Linked List
    public int removeFirst() {
        if (size == 0) { // If list is empty
            System.out.println("Linked List is Empty");
            return -1;
        } else if (size == 1) { // If list has only one element
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next; // Move head to the next node
        size--;
        return val;
    }

    // Remove the last node of the Linked List
    public int removeLast() {
        if (size == 0) { // If list is empty
            System.out.println("Linked List is Empty");
            return -1;
        } else if (size == 1) { // If list has only one element
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) { // Traverse to the second last node
            prev = prev.next;
        }

        int val = prev.next.data; // Get the last node's data
        prev.next = null; // Remove the last node
        tail = prev; // Update tail to the second last node
        size--;
        return val;
    }

    // Iterative search for a key in the Linked List
    public int iterativeSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) { // If key found, return its index
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1; // If key not found
    }

    // Helper function for recursive search
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int index = helper(head.next, key);

        if (index == -1) {
            return -1;
        }

        return index + 1;
    }

    // Recursive search for a key in the Linked List
    public int recursiveSearch(int key) {
        return helper(head, key);
    }

    // Reverse the Linked List
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next; // Save next node
            curr.next = prev; // Reverse the link
            prev = curr; // Move prev and curr one step forward
            curr = next;
        }

        head = prev; // Update head to the new first node
    }

    // Delete the Nth node from the end of the Linked List
    public void deleteNthFromEnd(int n) {
        // Calculate size of Linked List
        int sz = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        // If Nth node from end is the head
        if (n == sz) {
            head = head.next;
            return;
        }

        // Traverse to the node before the Nth node from the end
        Node prev = head;
        for (int i = 1; i < sz - n; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next; // Skip the Nth node
    }

    // Find the middle node using the slow-fast pointer approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // Slow will be at the middle
    }

    // Check if the Linked List is a palindrome
    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true; // Empty or single node list is always a palindrome
        }

        // Find the middle of the Linked List
        Node midNode = findMid(head);

        // Reverse the second half of the list
        Node prev = null;
        Node curr = midNode.next;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        // Compare the first half with the reversed second half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    // Detect a cycle in the Linked List using Floyd's Cycle-Finding Algorithm
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Cycle detected
            }
        }

        return false;
    }

    // Remove a cycle from the Linked List
    public static void removeCycle() {
        // Detect the cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (!cycle) {
            return; // No cycle detected
        }

        // Find the starting point of the cycle
        slow = head;
        Node prev = null; // Previous node to break the cycle
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null; // Break the cycle
    }

    // Merge Sort on Linked List
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find the middle of the list
        Node mid = getMid(head);

        // Split the list into two halves
        Node rightHead = mid.next;
        mid.next = null;

        // Recursively sort both halves
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // Merge the two sorted halves
        return merge(newLeft, newRight);
    }

    // Merge two sorted linked lists into one sorted linked list
    private Node merge(Node head1, Node head2) {
        Node mergedList = new Node(-1); // Dummy node to start the merged list
        Node temp = mergedList; // Pointer to build the merged list

        // Compare nodes from both lists and merge them in sorted order
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next; // Move temp pointer to next
        }

        // If any list still has remaining nodes, append them
        if (head1 != null) {
            temp.next = head1;
        } else {
            temp.next = head2;
        }

        return mergedList.next; // Return the next node of dummy as head of the merged list
    }

    // Helper function to find the middle of the linked list
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // slow will be the mid node
    }

    // Main method to test LinkedList functionalities
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);

        // Print the current list
        ll.print(); // Output: 2 -> 1 -> 3 -> 4 -> null

        // Test adding an element in the middle
        ll.add(2, 5);
        ll.print(); // Output: 2 -> 1 -> 5 -> 3 -> 4 -> null

        // Remove the first element
        ll.removeFirst();
        ll.print(); // Output: 1 -> 5 -> 3 -> 4 -> null

        // Remove the last element
        ll.removeLast();
        ll.print(); // Output: 1 -> 5 -> 3 -> null

        // Search for an element iteratively
        System.out.println("Element 3 found at index: " + ll.iterativeSearch(3)); // Output: 2

        // Search for an element recursively
        System.out.println("Element 5 found at index: " + ll.recursiveSearch(5)); // Output: 1

        // Reverse the list
        ll.reverse();
        ll.print(); // Output: 3 -> 5 -> 1 -> null

        // Check if the list is a palindrome
        System.out.println("Is Palindrome: " + ll.checkPalindrome()); // Output: false

        // Add elements to create a palindrome
        ll.addFirst(1);
        ll.addLast(3);
        ll.print(); // Output: 1 -> 3 -> 5 -> 1 -> 3 -> null

        System.out.println("Is Palindrome: " + ll.checkPalindrome()); // Output: true

        // Test cycle detection
        System.out.println("Has Cycle: " + LinkedList.isCycle()); // Output: false

        // Add cycle for testing
        ll.tail.next = ll.head.next;
        System.out.println("Has Cycle: " + LinkedList.isCycle()); // Output: true

        // Remove cycle
        LinkedList.removeCycle();
        System.out.println("Has Cycle: " + LinkedList.isCycle()); // Output: false

        // Test merge sort
        LinkedList sortedList = new LinkedList();
        sortedList.addFirst(10);
        sortedList.addFirst(5);
        sortedList.addFirst(7);
        sortedList.addFirst(3);

        // Print unsorted list
        sortedList.print(); // Output: 3 -> 7 -> 5 -> 10 -> null

        // Sort the list using merge sort
        sortedList.head = sortedList.mergeSort(sortedList.head);

        // Print sorted list
        sortedList.print(); // Output: 3 -> 5 -> 7 -> 10 -> null
    }
}

