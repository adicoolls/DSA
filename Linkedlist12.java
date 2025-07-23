// find if two linked list intersect or not if they did then return
//the node where they intersect.
class node {
    int data;
    node next;
    node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Linkedlist12 {
    node head;
    static int getlength(node head){
        node temp = head;
        int i = 0;
        while(temp != null){
            temp = temp.next;
            i++;
        }
        return i;
    }

    static node getintersection(node head1 , node head2){
      int a =   getlength(head1);
      int b =   getlength(head2);

        if(a > b){
            int d = a -b;
            while(d-- > 0) head1 = head1.next;
        }
        else{
            int d = b - a;
            while(d-- > 0) head2 = head2.next;
        }
        while(head1 != null && head2 != null){
             if(head1 == head2){
              return head1;
            }
         
            head1 = head1.next;
            head2 = head2.next;

           
        }
        return head1;
       
    }
    public static void main(String[] args) {
        node common = new node(60);
        common.next = new node(70);
        common.next.next = new node(80);

        node head1 = new node(10);
        head1.next = new node(20);
        head1.next.next = new node(30);
        head1.next.next.next = common;
        //intersecting the nodes
        node head2 = new node(40);
        head2.next = new node(50);
        head2.next.next = common;

        node intersection =  getintersection(head1, head2);
        if(intersection != null){

            System.out.println("the lists are intersecting and the node where they intersect is " + intersection.data);
        }else{
            System.out.println("the linked list are not intersect");
        }
        
    }
}
