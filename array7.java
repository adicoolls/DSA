import java.util.Arrays;

public class array7 {
    public static int findKthLargest(int[] arr, int K) {
        // Sort the array in descending order
        Arrays.sort(arr);
        
        // Return the Kth largest element (K-1 because of zero indexing)
        return arr[arr.length - K];
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        int K = 2;

        System.out.println("The " + K + "th largest element is: " + findKthLargest(arr, K));
        System.out.println(arr[3]);
    }
}
//understand this code and do the code of kth smallest number in an array