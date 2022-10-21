/*
 * @lc app=leetcode id=190 lang=java
 *
 * [190] Reverse Bits
 */

// @lc code=start
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        // Bit Manipulation Approach: 
        // Transverse input from LSB to MSB, check if bit is 1
        // if bit is 1, append to result
        // shift result left for every interation
        // shift input right for every iteration
        // O(n) time, O(k) space?

        int result = 0;

        for (int i = 0; i < Integer.SIZE; i++) {
            result = result << 1;
            if ((n & 1) > 0) {
                result = result ^ 1;
            }
            n = n >> 1;
        }
        return result;
    }
}
// @lc code=end

