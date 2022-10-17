/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        // 1D dynamic-programming:
        // accumulating sum
        // O(n) time, O(k) space

        int stepOne = 1;
        int stepTwo = 1;

        for (int i = 0; i < n - 1; i++) {
            int temp = stepOne;
            stepOne += stepTwo;
            stepTwo = temp;
        }
        return stepOne;
    }
}
// @lc code=end
