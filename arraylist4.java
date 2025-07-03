//sorting of arraylist in subprogram section
import java.util.*;
public class arraylist4 {
    public static void sortascending(ArrayList<Integer> list){
          Collections.sort(list);
          System.out.println("sorted in ascending order:" + list);
    }
    public static void sortdescending(ArrayList<Integer>list){
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("sorted in Descending order" + list);
    }
    public static void searchElement(ArrayList<Integer>list, int element){
        if(list.contains(element)){
            System.out.println(element + " found at index " + list.indexOf(element));

        }else{
            System.out.println(element + " the element is not found in array");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(35);
        list.add(23);
        list.add(53);
        list.add(89);
        list.add(12);
        sortascending(list);
        sortdescending(list);
        searchElement(list, 23);
        searchElement(list, 99);

    }
}
