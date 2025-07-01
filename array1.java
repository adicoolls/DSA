import java.util.*;

public class array1 {
    
    public static void main(String[] args) {
        //int marks[] = new int[39];
        int marks[] = {89, 32, 21};
     
        update(marks);
         for( int i=0; i<marks.length; i++){
        System.err.println(marks[i] + " ");
         }
         }
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
}
