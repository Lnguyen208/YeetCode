/*
 * @lc app=leetcode id=258 lang=java
 *
 * [258] Add Digits
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        // Modulo Approach:
        // Double loops, outer loops until num is 1 digit
        // inner loop loops modulo and add to running sum
        // O(n^2) time, O(k) space

        while (num > 9) {
            int temp = 0;
            while (num != 0) {
                temp += num % 10;
                num /= 10;
            }
            num = temp;
        }
        return num;
    }
}
// @lc code=end
