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
        // Create dummy head
        // Iterate every element of linked list
        // compare next with k, skip to next next if matches
        // O(n) time, O(k) space

        ListNode dummyHead = new ListNode(val - 1);
        dummyHead.next = head;
        head = dummyHead;

        while (head.next != null) {
            if (head.next.val == val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return dummyHead.next;
    }
}
// @lc code=end
