/**
 *  Best Time to Buy and Sell Stock
 * Say you have an array for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, 
buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Kadane's Algorithm - Since no one has mentioned about this so far :) (In case if interviewer twists the input)
 */

class Solution {
    public int maxProfit(int[] prices) {
        int maxDiff = 0;
        int currDiff = 0;  
        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            currDiff = currDiff+ diff;
            if (currDiff < 0) {
                currDiff = 0;
            }
            maxDiff = Math.max(currDiff, maxDiff);
        }
        return maxDiff;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int profit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > profit) {
                profit = prices[i] - min;
            }
        }
        return profit;
    }
}