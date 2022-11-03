/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
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
    public ListNode removeElements(ListNode head, int val) {
        // Iterative Approach:
        // Iterate every element of linked list
        // compare with k, remove if matches
        // check head for match at end
        // O(n) time, O(k) space
        // ToDo: implement sliding window approach for deletion?

        ListNode curr = head;

        while (curr != null && curr.next != null) {
            ListNode next = curr.next;
            if (next.val == val) {
                ListNode temp = next.next;
                next.next = null;
                curr.next = temp;
                next = temp;
            } else {
                curr = next;
                next = next.next;
            }
        }

        if (head != null && head.val == val) {
            ListNode temp = head.next;
            head.next = null;
            head = temp;
        }
        return head;
    }
}
// @lc code=end
