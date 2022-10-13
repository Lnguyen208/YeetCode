/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        // Brute Force Approach:
        // Interate and square every integer averages on [0, x]
        // and narrow down to a value is apprx equal to x
        // O(>n) space, O(k) space
        // BinarySearch Approach:
        // Divide range between 0 and x in half then omit the half that is
        // out of range (ie: too small or too large)
        // O(log(n)) time, O(k) space

        if (x == 1) return 1;
        
        double low = 0;
        double high = x;
        double mid = (low + high) / 2;
        int iterations = 100;

        while (iterations > -1) {
            double squared = mid*mid;
            if (squared == x)
                return (int) mid;
            else if (squared < x)
                low = mid;
            else
                high = mid;
            mid = (low + high) / 2;
            iterations--;
        }
        return (int) mid;
    }

}
// @lc code=end
