/*
 * @lc app=leetcode id=263 lang=java
 *
 * [263] Ugly Number
 */

// @lc code=start
class Solution {
    public boolean isUgly(int n) {
        // Modulo & Divide Approach:
        // Divide by 2, 3, and 5 respectively
        // until the n is no longer divisible
        // true if remaining number is 1, false otherwise
        // O(log(n)) time, n is only divisible by 2 for worst case
        // O(k) space
        if (n > 1) {
            while (n % 2 == 0)
                n /= 2;
            while (n % 3 == 0)
                n /= 3;
            while (n % 5 == 0)
                n /= 5;
        }
        return (n == 1);
    }
}
// @lc code=end
