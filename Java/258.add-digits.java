/*
 * @lc app=leetcode id=258 lang=java
 *
 * [258] Add Digits
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        // Modulo/Divide Loop Approach:
        // Double loops, outer loops until num is 1 digit
        // inner loop loops modulo and add to running sum
        // O(n^2) time, O(k) space
        // Modulo Math Approach:
        // Use result of num modulo 9 to calculate remainder since
        // the output will be a value between 0-9 and adding digit
        // cycle is based on decimal system
        // O(k) time, O(k) space
        if (num == 0)
            return 0;
        else if (num % 9 == 0)
            return 9;
        return num % 9;
    }
}
// @lc code=end
