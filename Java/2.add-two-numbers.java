/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Iterative Approach:
        // Iterate through LinkedNode. Track carry and sum.
        // O(n) time, O(n + m) space, n and m are length of list and is the return
        ListNode result = new ListNode(-1);
        ListNode dummyHead = result;
        boolean carry = false;
        
        while (l2 != null || l1 != null || carry) {
            int sum = 0;
            if (carry) {
                sum++;
                carry = false;
            }
            if (l2 != null) {
                sum+= l2.val;
                l2 = l2.next;
            }
            if (l1 != null) {
                sum+= l1.val;
                l1 = l1.next;
            }
            if (sum > 9) {
                sum-= 10;
                carry = true;
            }
            result.next = new ListNode(sum);
            result = result.next;
        }
        result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }
}
// @lc code=end
