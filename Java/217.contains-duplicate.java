import java.util.HashSet;

/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // brute force approach
        // nested for loops to check for duplicates
        // O(n^2) time O(k) space
        // sort array first
        // iterate once and check for duplicate nums
        // O(nlog(n) + n) time O(k) space
        // set approach
        // iterate once, add each elem to set, check set for duplicates
        // O(n) time O(n) space
        
        HashSet <Integer> hashSet = new HashSet<Integer>();
        for (int num : nums) {
            if (!hashSet.add(num))
                return true;
            hashSet.add(num);
        }
        return false;
    }
}
// @lc code=end

