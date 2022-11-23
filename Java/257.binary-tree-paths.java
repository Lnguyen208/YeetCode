/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
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

    ArrayList<String> result = new ArrayList<String>();

    public List<String> binaryTreePaths(TreeNode root) {
        // DFS Inorder Recursive Approach:
        // reaching leaf does not add arrow & also adds str to list
        // not leaf, add value & arrow. check left and right for next branch
        // O(?) time, not sure but greater than n
        // O(# of paths * # of intermediate paths) space. Strings are immutable
        
        if (root == null) return result;
        dfs(root, "");
        return result;
    }
    void dfs(TreeNode curr, String str) {
        if (curr.left == null && curr.right == null) {
            result.add(str + curr.val);
            return;
        }
        if (curr.left == null) {
            dfs(curr.right, "" + str + curr.val + "->");
            return;
        }
        if (curr.right == null) {
            dfs(curr.left, "" + str + curr.val + "->");
            return;
        }
        dfs(curr.left, "" + str + curr.val + "->");
        dfs(curr.right, "" + str + curr.val + "->");
    }
}
// @lc code=end
