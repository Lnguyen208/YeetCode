/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        // Bit-manipulation Approach:
        // Perform XOR operation between 0 and every value
        // O(n) time, O(k) space

        int soln = 0;
        for (int num : nums) {
            soln = num ^ soln;
        }
        return soln;
    }
}
// @lc code=end
