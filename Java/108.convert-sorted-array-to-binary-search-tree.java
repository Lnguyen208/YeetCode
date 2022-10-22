/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        // Divide and Conquer Approach: 
        // Designate a mid point and use as root for tree & subtrees
        // Repeat process for left side of array for left branch
        // and right side for right branch
        // Stop when there are no more elements to add
        // O(n) time, O(n) space
        return helper(nums, 0, nums.length - 1);
    }
    static TreeNode helper(int[] nums, int iMin, int iMax) {
       
        if (iMin > iMax) 
            {
                return null;
            }; 

        int midIndex = (iMin + iMax) / 2;
        TreeNode root = new TreeNode(nums[midIndex]);
        
        root.left = helper(nums, iMin, midIndex - 1);
        root.right = helper(nums, midIndex + 1, iMax);

        return root;
    }
}
// @lc code=end

