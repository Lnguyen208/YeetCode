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
        // Recursive Approach: (TODO)

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode branchLeft = root;
        TreeNode branchRight = root;

        while ((branchLeft != null || branchRight != null) || !stack.isEmpty()) {
            while (branchLeft != null && branchRight != null) {
                stack.push(branchLeft);
                stack.push(branchRight);
                branchLeft = branchLeft.left;
                branchRight = branchRight.right;
            }

            if ((branchLeft == null && branchRight != null) || 
                (branchRight == null && branchLeft != null)) {
                    return false;
            }

            TreeNode nodeR = stack.pop();
            TreeNode nodeL = stack.pop();

            if (nodeR.val != nodeL.val) {
                return false;
            }

            else {
                branchLeft = nodeL.right;
                branchRight = nodeR.left;
            }
        }
        return true;
    }
}
// @lc code=end

