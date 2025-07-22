/*
 * Floyd’s Cycle Detection in Linked List
 * 
 * This program detects if a cycle is present in a singly linked list and 
 * returns the starting node of the loop using Floyd’s Tortoise and Hare algorithm.
 * 
 * Author:  Aditya Kulkarni
 * Date: [23-07-2025]
 */

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Linkedlist10 {
    Node head;

    // Function to detect the start of the loop (if present)
    Node detectLoopStart() {
        Node slow = head;
        Node fast = head;

        // Step 1: Detect loop using Floyd’s Cycle Detection
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Loop detected
            if (slow == fast) {
                break;
            }
        }

        // No loop
        if (fast == null || fast.next == null) {
            return null;
        }

        // Step 2: Move slow to head, keep fast at meeting point
        slow = head;

        // Move both one step at a time to find start of loop
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Both meet at the start of the loop
        return slow;
    }

    // Utility function to add a new node at the end
    void append(int new_data) {
        Node new_node = new Node(new_data);

        if (head == null) {
            head = new_node;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = new_node;
    }

    // Utility function to create a loop for testing
    void createLoop(int position) {
        if (position == 0) return;

        Node loopNode = head;
        for (int i = 1; i < position; i++) {
            loopNode = loopNode.next;
        }

        Node end = head;
        while (end.next != null) {
            end = end.next;
        }

        end.next = loopNode;
    }

    public static void main(String[] args) {
        Linkedlist10 list = new Linkedlist10();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        // Create a loop (node 50 points to node 30)
        list.createLoop(3);

        Node loopStart = list.detectLoopStart();

        if (loopStart != null) {
            System.out.println("Loop starts at node with data: " + loopStart.data);
        } else {
            System.out.println("No loop detected.");
        }
    }
}
