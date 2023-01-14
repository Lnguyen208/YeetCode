/*
 * @lc app=leetcode id=342 lang=java
 *
 * [342] Power of Four
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int n) {
        // Integer data type limitation Approach:
        // Anything divisible by 2 can cause errors if same approach as power of 3 is
        // used because 3 is a prime number while 4 is not.
        // Not many possible values are possible for n since int max is limited at 2147483647 so
        // explicitly denote the 15 possible values
        // O(1) time, O(1) Space
        return (n == 1 || n == 4 || n == 16 || n == 64 || n == 256 ||
                n == 1024 || n == 4096 || n == 16384 || n == 65536 ||
                n == 262144 || n == 1048576 || n == 4194304 || n == 16777216 ||
                n == 67108864 || n == 268435456 || n == 1073741824);
    }
}
// @lc code=end
