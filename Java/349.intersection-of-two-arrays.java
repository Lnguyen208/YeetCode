/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start
import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Binary Search Approach:
        // Sort longer list ascending (quicksort)
        // Use values in shorter list to
        // find if the sorted list contains it
        // via binary search. If matched, add to result list
        // O(mlog(m)*nlog(m)) time, n is num1, m is num2.
        // Worst case is both arrays are the same length
        // O(log(n)) space, space used for quicksort
        // Iterative/HashSet Approach:
        // Put unique values in one list into HashSet
        // Use HashSet to determine if an intersection exists
        // in the other list. If true, add value to solution
        // list and remove from HashSet
        // O(n+m) time, O(n) space
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> intersect = new ArrayList<Integer>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num: nums2) {
            if (set.contains(num)) {
                intersect.add(num);
                set.remove(num);
            }
        }
        return intersect.stream().mapToInt(i->i).toArray();
    }
}
// @lc code=end
