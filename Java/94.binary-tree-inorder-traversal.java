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
        // DFS Stack Iterative Approach:
        // Pushes all left nodes into a stack, pops when moving back 
        // tree to previous level, check right branch if not null
        // transverses right and repeat left branch first,
        // then pop when done
        // O(n) time, n is tree height O(n) space
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> temp = new Stack<TreeNode>();
        TreeNode node = root;

        while (node != null || !temp.isEmpty()) {
            while (node != null) {
                temp.push(node);
                node = node.left;
            }
            result.add(temp.peek().val);
            node = temp.pop().right;
        }
        return result;
    }
}
// @lc code=end
