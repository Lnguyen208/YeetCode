/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Stack DFS Inorder Traversal Approach: 
        // Iterate inorder of both trees, pushing in both nodes simultaneously
        // Check for mismatches after reaching a leaf on either or both trees
        // O(n) time, n is height of tree O(n) space

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode tempA = p;
        TreeNode tempB = q;

        while ((tempA != null || tempB != null) || !stack.isEmpty()) {
            while (tempA != null && tempB != null) {
                stack.push(tempA);
                stack.push(tempB); 
                tempA = tempA.left;
                tempB = tempB.left;
            }
            
            if ((tempA == null && tempB != null) || 
                (tempB == null && tempA != null)) {
                    return false;
            }
    
            TreeNode nodeB = stack.pop();
            TreeNode nodeA = stack.pop();

            if (nodeB.val != nodeA.val) {
                return false;
            }
            
            else {
                tempA = nodeA.right;
                tempB = nodeB.right;
            }
        }
        return true;
    }
}
// @lc code=end

