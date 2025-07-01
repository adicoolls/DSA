//binary search aglorithm , 5 steps in that 
//start
public class array3{
    public static int binarysearch(int elements[], int key){
        int start = 0;
        int end = elements.length - 1;

        while(start <= end){
          int  mid = (start + end )/2;
          if(elements[mid] == key){
            return mid;
          }
          if(elements[mid] < key){
            start = mid + 1;
          }
          else {
            end = mid -1;
          }
        }
        return -1;
    }
    public static void main(String[] args) {
        int elements[] = {10, 20,30, 40, 50 , 60, 70, 80, 90};
        int key = 30;

        int result = binarysearch(elements, key);

        if(result == -1 ){
            System.out.println("the number is not found in the array");
        }
        else {
            System.out.println("the number is found in the array of " + result + " index");
        }

    }
}