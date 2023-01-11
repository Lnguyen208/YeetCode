/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        // Two-Pointer Approach:
        // Set p1 to scout for zeroes
        // Set p2 to be the paste destination
        // If not zero, paste value at p2 to be value at p1 and increment both
        // If zero, increment p1 only
        // when p1 reaches end, let all values at p2 and after become 0
        // O(n) time, O(1) space
        int p1 = 0;
        int p2 = 0;

        while (p1 < nums.length) {
            if (nums[p1] == 0) {
                p1++;
            }
            else {
                nums[p2] = nums[p1];
                p1++;
                p2++;
            }
        }
        
        while (p2 < nums.length) {
            nums[p2] = 0;
            p2++;
        }
    }
}
// @lc code=end
