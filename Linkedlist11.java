// remove the loop if exists in linked list using floyd's algorithm and pointer adjustments
// Title: Remove Loop in Linked List using Floyd's Cycle Detection Algorithm
// Description:
// This Java program detects and removes a loop in a singly linked list using Floyd’s Cycle Detection (Tortoise and Hare) algorithm.
// After detecting a cycle, the program finds the start of the loop and removes it by adjusting the pointers.
// Key Features:
// append() – Adds a new node at the end of the list
// createLoop(position) – Introduces a loop at the specified index
// removeLoop() – Detects and removes the loop if it exists
// printList() – Displays the linked list after loop removal
// Algorithm:
// Detect cycle using slow and fast pointers.
// Once detected, find the starting node of the loop.
// Set the previous node’s next to null to break the loop.
class node {
    int data;
    node next;

    node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Linkedlist11 {
    node head;
    void removeloop(){
        node slow = head;
        node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }
        }
        slow = head;
        while(slow.next != fast.next){
                 slow = slow.next;
                 fast = fast.next;
        }
        fast.next = null;
    }

    void append(int new_data){
        node newnode = new node(new_data);
        if (head == null) {
        head = newnode;
        return;
    }
        node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newnode;
    }
    void createloop(int position){
        node loopnode = head;
        for(int i = 0; i<position; i++){
            loopnode = loopnode.next;
        }
        node end = head;
        while(end.next != null){
            end = end.next;
        }
        end.next = loopnode;
    }
    void printlist(){
        node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Linkedlist11 list = new Linkedlist11();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);
        
        list.createloop(2);
        
        list.removeloop();
        list.printlist();
    }
}
