/*
 * @lc app=leetcode id=264 lang=java
 *
 * [264] Ugly Number II
 */

// @lc code=start
class Solution {
    public int nthUglyNumber(int n) {
        // Dynamic Programming Approach:
        // Track values that consists of only 2, 3, 5 factors in array
        // Tally num of multiple for which 2, 3, 5 are on to access array
        // and calculate what number is next for the value in array for respective
        // tallies are multiplied by respective factors
        // Use smallest value of the 3 for array at i, increment tallies for
        // where the chosen matches the value calculated
        // return value when i-1 equals n
        // O(n) time, O(n) space
        int result = 1;
        int tally2 = 0, tally3 = 0, tally5 = 0;
        int nextMul2 = 2, nextMul3 = 3, nextMul5 = 5;
        int[] arr = new int[n];
        arr[0] = 1;

        for (int i = 1; i < n; i++) {
            result = Math.min(nextMul2, Math.min(nextMul3, nextMul5));
            arr[i] = result;

            if (result == nextMul2) {
                tally2++;
                nextMul2 = arr[tally2] * 2;
            }
            if (result == nextMul3) {
                tally3++;
                nextMul3 = arr[tally3] * 3;
            }
            if (result == nextMul5) {
                tally5++;
                nextMul5 = arr[tally5] * 5;
            }
        }
        return result;
    }
}
// @lc code=end
