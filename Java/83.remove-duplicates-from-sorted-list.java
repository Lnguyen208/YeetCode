/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Brute Force Approach:
        // Iterative -- Use while loop to search for duplicate, exit when next is null
        // Recursive -- Call method to search for duplicate
        // base case: next node is null
        // O(n) time, O(k) space

        ListNode currentNode = head;
        if (currentNode == null) return head;
        while (currentNode.next != null) {
            ListNode delNode = currentNode.next;
            if (currentNode.val == delNode.val) {
                currentNode.next = delNode.next;
                delNode.next = null;
            }
            else currentNode = currentNode.next;
        }
        return head;
    }
}
// @lc code=end
