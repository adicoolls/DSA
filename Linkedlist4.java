//add first operation in linked list
class node {
    int data;
    node next;

    node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Linkedlist4 {
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
    public static void main(String[] args) {
        Linkedlist4 list = new Linkedlist4();
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

    }

    public void removefirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removefirst'");
    }
}
