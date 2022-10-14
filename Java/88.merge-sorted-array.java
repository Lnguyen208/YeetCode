/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Brute Force Approach:
        // Combine second array to first array
        // Use in place sorting. (Sequential, Insertion, Bubble)
        // O((n+m)^2) time, O(k) space
        // Use merge sort or quick sort
        // O((n+m)log(n+m) time, O(n+m) space

        for (int i = 0; i < n; i++) {
            nums1[m] = nums2[i];
            m++;
        }

        // Sequential Sort
        for (int i = 0; i < nums1.length - 1; i++) {
            for (int k = i + 1; k < nums1.length; k++) {
                if (nums1[k] < nums1[i]) {
                    int temp = nums1[i];
                    nums1[i] = nums1[k];
                    nums1[k] = temp;
                }
            }
        }
    }
}
// @lc code=end
