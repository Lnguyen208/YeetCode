/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // Binary Search Approach:
        // Set lower bound to lowest possible integer, set upper bound to input n
        // Set mid value to be lower bound + difference of boundaries divided by 2 to prevent overflow
        // if input n is max value for integer data type
        // Change boundary values depending on whether isBadVersion(mid) returns true or false
        // if true meaning 'bad product', change upper bound to be mid value
        // if false meaning 'good product', change lower bound to be mid value
        // loop until lower bound which represents good products at and before this value,
        // is not less than upper bound which represents the products at and above that value is bad
        // O(log(n)) time, O(1) space

        int lwrB = 1;
        int upprB = n;
        
        while(lwrB < upprB) {
            int mid = lwrB + (upprB - lwrB)/2;
            if(isBadVersion(mid)) {
                upprB = mid;
            }
            else {
                lwrB = mid + 1;
            }
        }
        return lwrB;
    }
}
// @lc code=end

