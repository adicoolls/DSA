//cloning an arraylist
import java.util.*;
public class arraylist5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("s");
        list.add("t" );
        list.add("u");

        //cloning the list

        ArrayList<String> clonedlist =  (ArrayList<String>) list.clone();
        System.out.println("the orginal list" + list);
        System.out.println("the cloned list " + clonedlist);
    }
}
