//find the pair of the array to targeted

public class array8 {
    public static void pair(int array[], int target){
        for(int i = 0 ; i<array.length; i++){
            for(int j = i+1; j<array.length; i++){
                  if(array[i] + array[j] == target){
                    System.out.println("(" + array[i] + "," + array[j] + ")");
                  }
            }
        }
    }
    public static void main(String[] args) {
        int array[] = {4, 6, 7, 9, 2};
        int target = 16;
        pair(array, target);
    }
}
