/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        // Bubble Sort Approach: (in place)
        // Start at end, mark destination swap position, 
        // check array values moving towards front
        // if 0 found, swap consecutive indice pairs until
        // destination is reached, decrement destination swap position
        // O(n^2) time, O(1) space
        int swapP = nums.length - 1;
        for (int i = swapP; i >= 0; i--) {
            if (nums[i] == 0) {
                for(int j = i; j < swapP; j++) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
                swapP--;
            }
        }
    }
}
// @lc code=end
