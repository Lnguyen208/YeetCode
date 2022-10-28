/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start
import java.util.*;
class Solution {
    public boolean isHappy(int n) {
        // Hashset Approach:
        // Store sum value in hashset
        // If sum shows up again during computation
        // return false because a cycle is present
        // O(? * d) time, O(?) space, ? for however long it takes
        // to reach the cycle front and end or a 1
        // d is for number of digits n

        HashSet<Integer> squaredSumSet = new HashSet<Integer>();

        while (n != 1) {
            int squaredSum = 0;
            while (n != 0) {
                int mod = n % 10;
                squaredSum += Math.pow(mod, 2);
                n /= 10;
            }
            if (squaredSumSet.contains(squaredSum)) {
                return false;
            }
            else {
                squaredSumSet.add(squaredSum);
            }
            n = squaredSum;
        }
        return true;
    }
}
// @lc code=end

