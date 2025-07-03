// Problem Summary:
// You are given an array of prices where prices[i] is the price of a stock on the ith day.
// You must choose a single day to buy and a different day in the future to sell.
// Return the maximum profit you can achieve. If you can't make any profit, return 0.

public class StockProfit {

    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];     // Track the lowest price seen so far
        int maxProfit = 0;            // Track the highest profit possible

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minPrice;     // Potential profit if we sell today
            if (profit > maxProfit) {
                maxProfit = profit;                // Update maxProfit if better profit found
            }

            if (prices[i] < minPrice) {
                minPrice = prices[i];              // Update minPrice if cheaper stock found
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // Example input
        int result = maxProfit(prices);
        System.out.println("Maximum Profit: " + result); // Expected Output: 5
    }
}

