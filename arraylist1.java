import java.util.ArrayList;

public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("aditya");
        list2.add("parth");
        list2.add("vedant");
        list2.add("prathamesh");
        list.add(32);
        list.add(34);
        list.add(36);
        list.add(37);
        list.add(33);
        System.err.println(list);
    //    int x = list.get(3);
    //    System.out.println(x);
    list.remove(2);
    System.out.println(list);
    System.out.println(list2);
    }
}
