/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
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
    public boolean isSymmetric(TreeNode root) {
        // Stack DFS Inorder Traversal Approach: (iterative)
        // Iterate over both branch inorderly where
        // left branch traverses to max depth for left first and
        // right branch traverses to max depth for right first
        // Check for mismatches
        // O(n) time, where n is height of tree O(n) space
        // Recursive Approach:
        // Each tree and subtree must have mirrored left and right 
        // branches to the other side, so have two temps that
        // hold the same relative current position and
        // check if each other's left and right branches are 
        // mirrors
        // Base: left and right branches are null
        // recursion: left and right branch mirror
        // O(n) time, n is height of tree, O(n) call stack

        return helper(root, root);
    }
    
    static boolean helper(TreeNode nodeL, TreeNode nodeR) {
        if (nodeL == null && nodeR == null) {
            return true;
        }
        // at least one node is not null at this point
        // recursion on next left on left and next right on right
        // and next right on left and next left on right
        // (lateral aspect of tree matches, medial aspects match)
        if (nodeL != null && nodeR != null && 
                nodeL.val == nodeR.val) {
            return (helper(nodeL.left, nodeR.right) && 
                        helper(nodeL.right, nodeR.left));
        }
        // true iff all conditions are met to be mirrors, else
        return false;
    }
}
// @lc code=end

