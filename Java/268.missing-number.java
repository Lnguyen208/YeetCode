/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        // Math Solution, Gauss Summation:
        // Sum of all consecutive integers from [1,n] = (# of pairs)*(n)/2
        // Return difference of result from Gauss Summation and input's sum
        // O(n) time, O(1) space

        int sumIn = 0;
        int sumG = nums.length*(nums.length + 1)/2;

        for(int num:nums) {
            sumIn+=num;
        }

        return sumG - sumIn;
    }
}
// @lc code=end

