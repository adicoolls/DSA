// deleting the any node of the linked list

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linkedlist8 {
    node head ;
    node tail;
void printlist(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
      
    void addfirst(int data) {
        node newnode = new node(data);
        if (newnode == null) {
            newnode = head = tail;
        }
        newnode.next = head;
        head = newnode;
    }

    void removeanynode(int i){
        node prev = head;
        int count = 0;
        while(count < i - 1){
            //prev = prev.next;
            count++;
        }
        prev.next = prev.next.next;
    }
    public static void main(String[] args) {
        Linkedlist8 list = new Linkedlist8();

        list.head = new node(10);
        node second = new node(20);
        node third = new node(30);
        list.tail = new node(40);
        //connecting the nodes

        list.head.next = second;
        second.next = third;
        third.next = list.tail;
        list.printlist();
        list.removeanynode(2);
        list.printlist();        
    }
}
