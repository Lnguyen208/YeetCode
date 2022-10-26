/*
 * @lc app=leetcode id=145 lang=java
 *
 * [145] Binary Tree Postorder Traversal
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
    public List<Integer> postorderTraversal(TreeNode root) {
    // Recursive Approach:
    // Call method until left subtree leaves are met then
    // Add and return to list
    // Repeat with right side
    // Add original root at end
    // O(n) time, O(n) space where n is the max # of nodes

    ArrayList<Integer> list = new ArrayList<Integer>();
    helper(list,root);
    return list;
    }

    static Integer helper(ArrayList list, TreeNode root) {
        if (root != null) {
            helper(list, root.left);
            helper(list, root.right);
            list.add(root.val);
        }
        return null;
    }
}
// @lc code=end

