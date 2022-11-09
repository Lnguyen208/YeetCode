/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 */

// @lc code=start
import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // HashMap Approach:
        // Put value and index position in hashmap
        // Find match, compare index difference with k
        // O(n) time, O(n) space

        HashMap<Integer, Integer> match = new HashMap<Integer, Integer>();
        match.put(nums[0], 0);
        boolean soln = false;
        int i = 1;

        while (!soln && i < nums.length) {
            if (match.containsKey(nums[i])) {
                soln = Math.abs(match.get(nums[i]) - i) <= k;
            }
            match.put(nums[i], i);
            i++;
        }
        return soln;
    }
}
// @lc code=end
