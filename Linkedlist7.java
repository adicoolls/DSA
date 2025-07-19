//operation of removing the last iteration of the linked list
class node{
    int data;
    node next;

    node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Linkedlist7 {
    node head;
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
      
    void addfirst(int data){
        node newnode = new node(data);
        if(newnode == null){
          newnode = head = tail;
        }
        newnode.next = head;
        head = newnode;

    }
    void removefirst(){
        node temp = head;
        head = temp.next;
    }

    void addlast(int data){
        node newnode = new node(data);
        newnode = tail.next;
        tail = newnode;


    }
    void removelast(){
        node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }
    public static void main(String[] args) {
        Linkedlist7 list = new Linkedlist7();

        list.head = new node(10);
        node second = new node(20);
        node third = new node(30);
        list.tail = new node(40);

        //connecting the nodes 

        list.head.next = second;
        second.next = third;
        third.next = list.tail;

        list.printlist();
        list.addfirst(50);
        list.printlist();
        list.removefirst();
        list.printlist();
        list.addlast(60);
        list.printlist();
        list.removelast();
        list.printlist();
    }
}
