/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        // brute force approach
        // iterate over each num, if not equal to val
        // overwrite to front, use counter as index
        // O(n) time O(k) space
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                int numAtIndex = nums[i];
                nums[counter] = numAtIndex;
                counter++;
            }
        }
        return counter;
    }
}
// @lc code=end

