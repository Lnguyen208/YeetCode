/*
 * @lc app=leetcode id=104 lang=java
 *
 * [104] Maximum Depth of Binary Tree
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
    public int maxDepth(TreeNode root) {
        // Recursive Approach: 
        // Base: TreeNode is null, return 0
        // Calling: Find the max depth between 
        // depth of left & right
        // O(n) time, n is the height of the tree O(n) space
        if (root == null) return 0;
        return (1 + Math.max(maxDepth(root.left), maxDepth(root.right)));
    }
}
// @lc code=end

