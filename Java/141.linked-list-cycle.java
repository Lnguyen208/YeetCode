/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Brute Force Approach:
        // Two-Pointer--Tortoise and Hare
        // Use slow-pointer which increments 1 at a time
        // and fast-pointer which increements 2 at a time
        // If both pointers == each other, LL has a cycle

        ListNode slowPointer = head;
        ListNode fastPointer = head;
        
        while (slowPointer != null || fastPointer != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next != null ? fastPointer.next.next : null;
            if (slowPointer == null || fastPointer == null) return false;
            if (slowPointer == fastPointer) return true;
        }
        return false;
    }
}
// @lc code=end
