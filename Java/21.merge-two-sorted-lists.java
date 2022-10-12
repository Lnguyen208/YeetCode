/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Brute Force Approach:
        // Two Pointer
        // O(n) time, O(n) space

        ListNode merged = new ListNode();
        ListNode head = merged;

        while (list1 != null || list2 != null) {
            ListNode newNode = new ListNode();

            if (list1 == null || (list2 != null && list2.val < list1.val)) {
                newNode.val = list2.val;
                list2 = list2.next;
            }
            else {
                newNode.val = list1.val;
                list1 = list1.next;
            }
            merged.next = newNode;
            merged = newNode;
        }

        return head.next;
    }
}
// @lc code=end
