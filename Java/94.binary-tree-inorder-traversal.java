/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
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
import java.util.*;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        // DFS List Recursive Approach:
        // Transverse left branch to leaves, return when null
        // Add to list from bottom to root
        // Repeat with right branch (minus root)
        // O(n) time, n is tree height O(n) space
    
        ArrayList<Integer> result = new ArrayList<Integer>();

        helper(result, root);
        return result;
    }

    static void helper(ArrayList<Integer> result, TreeNode node) {
        if (node == null) return;

        helper(result, node.left);
        result.add(node.val);
        helper(result, node.right);
    }
}
// @lc code=end
