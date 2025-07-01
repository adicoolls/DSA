//reversing the array
//if we need to reverse the array we need to take two pointer one is at start and one is at end then swap the both and at the end
//increment the start and decrement the end;
public class array5 {
    public static void  reverse(int elements[]){
        int start = 0;
        int end = elements.length - 1;
        while(start < end){
            int temp = elements[start];
            elements[start] = elements[end];
            elements[end] = temp;
            start++;
            end--;
        }
        
    }
    public static void main(String[] args) {
        int elements[] = {1, 2, 3, 4, 5};

        reverse(elements);
        for(int j : elements) {
            System.out.println(j + " ");
        }
        System.out.println("  ");
        for(int i = 0; i<elements.length; i++){
            System.out.println(elements[i] + " ");
        }
        
    }
}
