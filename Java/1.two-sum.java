import java.util.HashMap;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // brute force approach
        // nested for loops to check every combination
        // O(n^2) time O(k) space
        // sort + binary search approach
        // sort array, iterate over every position
        // use binary search to find operand
        // O(nlog(n) + nlog(n)) -> O(nlog(n)) time O(k) space
        // hashmap approach
        // iterate over nums, construct hashmap of (absolute difference, index)
        // check hashmap at every iteration for matching pair
        // O(n) time O(n) space

        HashMap <Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                return new int[] {hashMap.get(nums[i]), i};
            }
            // get delta, put in hashmap
            hashMap.put(target - nums[i], i);
        }

        return new int[]{};
    }
}
// @lc code=end

