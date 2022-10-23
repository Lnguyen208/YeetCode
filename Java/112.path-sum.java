/*
 * @lc app=leetcode id=112 lang=java
 *
 * [112] Path Sum
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Recursive DFS Approach: 
        // Conditions to be true ---
        // 1. Running sum & target sum are equal
        // 2. Final node has a null left & null right
        // Inorder traversal of tree while subracting node values from target 
        // until leaf is met, check if target is 0
        // O(n) time, O(n) space n is the number of nodes 
        
        if (root == null) 
            return false;
        if (root.left == null && root.right == null) 
            return targetSum - root.val == 0;
        return hasPathSum(root.left, targetSum - root.val) || 
                hasPathSum(root.right, targetSum - root.val);
    }
}
// @lc code=end

