/*
 * @lc app=leetcode id=144 lang=java
 *
 * [144] Binary Tree Preorder Traversal
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
    public List<Integer> preorderTraversal(TreeNode root) {
    // Recursive Approach: 
    // Add root to list then call method again using left subtree
    // then right subtree as the new root for the subtrees
    // Base case: root is null
    // O(n) time, O(n) space,  n is the # of nodes
    
        ArrayList<Integer> list = new ArrayList<Integer>();
        helper(list, root);
        return list;
    }
    
    static Integer helper(ArrayList list, TreeNode root) {
        if (root != null) {
            list.add(root.val);
            helper(list, root.left);
            helper(list, root.right);
        }
        return null;
    }
}
// @lc code=end

