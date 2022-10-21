/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.*;
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Two-Pointer Approach: 
        // Iterate both linked list, add nodes into respective lists
        // Two pointer starts at end of lists
        // Transverse upwards until last known same node is found
        // O(n) time, O(n) space

        ArrayList<ListNode> listA = new ArrayList<ListNode>();
        ArrayList<ListNode> listB = new ArrayList<ListNode>();
        
        while (headA != null) {
            listA.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            listB.add(headB);
            headB = headB.next;
        }

        int pointerA = listA.size() - 1;
        int pointerB = listB.size() - 1;
        ListNode intersection = null;

        while (pointerB >= 0) {
            if (listA.get(pointerA) == listB.get(pointerB)) {
                intersection = listA.get(pointerA);
            }
            if (pointerA > 0) pointerA--;
            pointerB--;
        }
        return intersection;
    }
}
// @lc code=end

