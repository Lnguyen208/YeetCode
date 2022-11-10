/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */

// @lc code=start
class Solution {
    public boolean isPowerOfTwo(int n) {
        // Brute Force Approach:
        // bit shift left until n is reached or value is > n
        // O(n) time, O(k) space
        // Bit-Wise Approach: 
        // use bit-wise and operator with n and n-1 to check if result is 0
        // based on property of bits, if n is a power of 2, there is only one 1
        // bit while the rest are 0
        // O(k) time, O(k) space
        return n > 0 && ((n & (n-1)) == 0);
    }
}
// @lc code=end
