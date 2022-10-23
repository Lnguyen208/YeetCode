/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
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
    public int minDepth(TreeNode root) {
        // DFS Approach: 
        // Recursively visit node until both nodes are null,
        // Choose the minimal depth of each subtree and
        // add to running min depth to a leave
        // O(n^2) time, O(n) space, n is the number of nodes
        // BFS Approach: 
        // Enqueue children while dequeuing parent
        // Track level of children being enqueued
        // Stop when children have two null nodes
        // O(n) time, O(n) space

        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int level = 1;
        
        while (!queue.isEmpty()) {
            int sizeQueue = queue.size();
            
            // Checks Nodes per Level
            while (sizeQueue > 0) {
                TreeNode temp = queue.poll();;
                
                if (temp.left == null && temp.right == null) 
                    return level;
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null) 
                    queue.add(temp.right);

                sizeQueue--;
            }
            level++;
        }
        return level;
        
    }
}
// @lc code=end

