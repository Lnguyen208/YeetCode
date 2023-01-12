/*
 * @lc app=leetcode id=292 lang=java
 *
 * [292] Nim Game
 */

// @lc code=start
class Solution {
    public boolean canWinNim(int n) {
        // Math Approach:
        // Multiples of 4 result in loss
        // O(1) time, O(1) space
        return n % 4 > 0;
    }
}
// @lc code=end
