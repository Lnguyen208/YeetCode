/*
 * @lc app=leetcode id=191 lang=java
 *
 * [191] Number of 1 Bits
 */

// @lc code=start
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // Bit Manipulation Approach: 
        // Bit-wise AND with int 1, add to running sum
        // right shift 1
        // O(n) time, O(k) space

        int soln = 0;
        for (int i = 0; i < Integer.SIZE; i++) {
            soln += n & 1;
            n = n >> 1;
        }
        return soln;
    }
}
// @lc code=end

