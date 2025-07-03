//sorting an arraylist
import java.util.*;
public class arraylist3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(7);
        list.add(2);
        System.out.println("before sorting : " + list);

        //sorting in descending order
        Collections.sort(list, Collections.reverseOrder());

        System.out.println("after sorting (descending order)" + list);
        System.out.println(list.contains(7));
        System.out.println(list.contains(22));

        System.out.println(list.indexOf(2));
        System.out.println(list.indexOf(45));
    }
}
