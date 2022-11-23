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
    public List<String> binaryTreePaths(TreeNode root) {
        // DFS Inorder Recursive Approach:
        // reaching leaf does not add arrow & also adds str to list
        // not leaf, add value & arrow. check left and right for next branch
        // O(?) time, not sure but greater than n
        // O(# of paths * # of intermediate paths) space. Strings are immutable
        // DFS Preorder Iterative Approach:
        // Traverse tree to leaf with stack, track parent node as value of child in HashMap
        // When a leaf is reached, pass leaf and HashMap to helper to create String for list
        //      - push leaf into stack
        //      - find leaf's parent in HashMap
        //      - push parent and repeat for parent until null value
        //      - pop stack and append to StringBuffer, add result to list
        // O(nlog(n)) time, O(n) space

        ArrayList<String> result = new ArrayList<String>();
        if (root == null) return result;
        Stack<TreeNode> stck = new Stack<TreeNode>();
        stck.push(root);
        HashMap<TreeNode, TreeNode> parent = new HashMap<TreeNode, TreeNode>();
        parent.put(root, null);

        while(!stck.isEmpty()) {
            TreeNode curr = stck.pop();
            if (curr.left == null && curr.right == null) {
                helper(curr, parent, result);
            }

            if (curr.right != null) {
                parent.put(curr.right, curr);
                stck.push(curr.right);
            }

            if (curr.left != null) {
                parent.put(curr.left, curr);
                stck.push(curr.left);
            }
        }
        return result;
    }

    static void helper(TreeNode current, HashMap<TreeNode, TreeNode> map, ArrayList<String> list) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        StringBuffer str = new StringBuffer();
        while (current != null) {
            stack.push(current);
            current = map.get(current);
        }

        while (!stack.isEmpty()) {
            current = stack.pop();
            str.append(current.val + "->");
        }
        str.delete(str.length()-2, str.length()); // remove last arrow
        list.add(str.toString());
    }
}
// @lc code=end
