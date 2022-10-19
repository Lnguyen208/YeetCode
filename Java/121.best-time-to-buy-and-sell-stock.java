/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        // Brute Force Approach:
        // nested loop, compile list of differences
        // return greatest difference
        // O(n^2) time, O(n^2) space
        // Two-Pointer, Sliding Window:
        // buy pointer, sell pointer is ahead of buy pointer
        // computes difference between pointers and compares
        // to current max profit
        // O(n) time, O(k) space

        int buy = 0;
        int sell = 1;
        int maxProfit = 0;
        
        while (sell < prices.length) {
            if (prices[buy] < prices[sell]) {
                int profit = prices[sell] - prices[buy];
                maxProfit = (profit > maxProfit) ? profit : maxProfit;
            }
            else {
                buy = sell;
            }
            sell++;
        }
        return maxProfit;
    }
}
// @lc code=end
