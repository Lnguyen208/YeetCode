/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {
    public int fib(int n) {
        // Brute Force:
        // Interate using for loop to compute
        // Recursion:
        // Base case-- n = 1 or n = 2
        // O(2^n) time, O(call stack?) space
        // 1-D Dynamic Programming:
        // Tabulation:
        // O(n) time, O(k) space
        if (n == 0)
            return 0;

        int pos1 = 1;
        int pos2 = 1;
        int counter = 2;

        while (counter < n) {
            int temp = pos2;
            pos2 += pos1;
            pos1 = temp;
            counter++;
        }
        return pos2;
    }
}
// @lc code=end
