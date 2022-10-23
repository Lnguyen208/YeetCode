/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
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
    public boolean isBalanced(TreeNode root) {
        // DFS recursion:
        // Iterate each branch to max depth
        // Compare if heights are balanced
        // Add to running total depth for respective branch and compare
        // O(n^2) time, O(n) space
        
        if (root == null) return true;

        int depthLeft = depthHelper(root.left);
        int depthRight = depthHelper(root.right);
        
        if (Math.abs(depthLeft - depthRight) < 2 && isBalanced(root.left) && 
                isBalanced(root.right)) {
            return true;
        }

        return false;
    }

    // for finding max depth
    static int depthHelper(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(depthHelper(node.left), depthHelper(node.right));
    }
}
// @lc code=end

