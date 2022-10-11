/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
    // Brute Force Approach:
    // Iterate through every element in array until element matches target or element is the first greater value
    // O(n) time, O(k) space
    // Binary Search Approach:
    // Half the array until there are two indices to check value against target
    // return the index that is first greater than target
    // O(log(n)) time, O(k) space
    int lowerIndex = 0;
    int upperIndex = nums.length-1;

    while((lowerIndex + 1) < upperIndex) {
        int mid = (upperIndex + lowerIndex)/2;
        if (nums[mid] == target) {
            return mid;
        }
        else if (nums[mid] < target) {
            lowerIndex = mid;
        }
        else {
            upperIndex = mid;
        }
    }
    if (nums[lowerIndex] == target) return lowerIndex;
    else if (nums[upperIndex] == target) return upperIndex;
    else if (target < nums[lowerIndex]) return lowerIndex;
    else if (target > nums[upperIndex]) return upperIndex + 1;
    else if (nums[lowerIndex] < target && nums[upperIndex] > target) return upperIndex;
    // -1 for errors
    return -1;
    }
}
// @lc code=end