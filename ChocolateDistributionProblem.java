// ChocolateDistributionProblem.java
// Author: Aditya Kulkarni
// Date: July 1, 2025
// Description: Solves the Chocolate Distribution Problem using the sliding window technique.

import java.util.Arrays;

public class ChocolateDistributionProblem {

    /**
     * Finds the minimum difference between the maximum and minimum chocolates
     * among any group of 'm' packets.
     *
     * @param arr Array of chocolate packets
     * @param m Number of students (i.e., size of the group)
     * @return Minimum difference between max and min chocolates in any group of size m
     */
    static int findMinDifference(int[] arr, int m) {
        int n = arr.length;

        // Edge Case: If no students or no packets
        if (m == 0 || n == 0) {
            return 0;
        }

        // Sort the packets to bring close numbers together
        Arrays.sort(arr);

        int minDifference = Integer.MAX_VALUE;

        // Slide a window of size 'm' over the sorted array
        for (int i = 0; i + m - 1 < n; i++) {
            int currentDiff = arr[i + m - 1] - arr[i]; // max - min
            if (currentDiff < minDifference) {
                minDifference = currentDiff;
            }
        }

        return minDifference;
    }

    public static void main(String[] args) {
        // Sample array of chocolate packets
        int[] packets = {3, 4, 5, 7, 9, 12, 15};

        // Number of students
        int students = 3;

        // Calculate and print result
        int result = findMinDifference(packets, students);
        System.out.println("Minimum difference between chocolates given to students: " + result);
    }
}
