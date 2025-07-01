//performing the linear searching in array
public class array2 {
    public static int linearsearch(int numbers[], int key){
        for( int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
               return i;
            }
        }  
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {23, 43, 25, 55, 11, 65, 76};
        int key = 55;
       int index =  linearsearch(numbers, key);
        if( index == -1){
            System.out.println("the key number is not in the array");
        }
        else {
            System.err.println("the key is in index " + index);
        }
    }
}
//we need to perform the binary search and linear search as well , in binary search the items in the array needs to be in the increasing order.

