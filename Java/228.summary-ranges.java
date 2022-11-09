/*
 * @lc app=leetcode id=228 lang=java
 *
 * [228] Summary Ranges
 */

// @lc code=start
import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        // Brute Force Approach:
        // Iterate values in nums until nonconsecutive value is found
        // Add to arrayList
        // O(n) time, O(n) space

        ArrayList<String> soln = new ArrayList<String>();
        int i = 0;

        while (i < nums.length) {
            String element = "";
            
            while (!(i == nums.length-1) && 
                    nums[i] + 1 == nums[i + 1]) {
                if (element.length() < 1) {
                    element += nums[i] + "->";
                }
                i++;
            }
            element += nums[i];
            System.out.println(element);
            soln.add(element);
            i++;
        }
        return soln;
    }
}
// @lc code=end
