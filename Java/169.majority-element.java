/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start

import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
    // Brute Force Approach:
    // Iterate every element and tracks count
    // return key of count that is greater than floor n/2
    // O(n) time, O(n) space

    HashMap<Integer, Integer> tally = new HashMap<Integer, Integer>();
    int key = 0;
    for (int i = 0; i < nums.length; i++) {
        if (tally.containsKey(nums[i])) {
            tally.put(nums[i], tally.get(nums[i]) + 1);
        }
        else {
            tally.put(nums[i], 1);
        }
        if (tally.get(nums[i]) > (nums.length/2)) {
            key = nums[i];
            break;
        }
    }
    return key;
    }
}
// @lc code=end
