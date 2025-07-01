// all pairs in an array;
public class array6 {
    public static void pairs(int elements[]){
        int tp = 0;
        for(int i = 0; i < elements.length; i++){
            for (int j = i + 1; j<elements.length; j++){
                System.out.println("(" + elements[i] + "," + elements[j] + ")");
                tp ++;
            }
        }
        System.out.println("the total number of pairs is " + tp);
    }
    public static void main(String[] args) {
        int elements[] = {1, 2, 3, 4, 5};
        pairs( elements);
    }
}
