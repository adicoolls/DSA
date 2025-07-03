import java.util.*;
public class arraylist2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("mango");
        list.add("cherry");

        // for(int i = 0; i< list.size(); i++){
        //     System.out.print(list.get(i) + " ,");
        // }
        Iterator <String> it= list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
