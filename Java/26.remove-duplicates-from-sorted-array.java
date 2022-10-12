/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start

class Solution {
    public int removeDuplicates(int[] nums) {
    // Brute Force Approach: 
    // Two-Pointers, one at first element, two at second element
    // Pointer two iterates every element in array comparing value with pointer one
    // When value at pointer two does not match pointer one's value, 
    // pointer one increments and is assigned value at pointer two
    // giving a new value for pointer two to compare to for duplicates
    // returns length of list that ends at pointer one
    // O(n) time, O(k) space
    int p1 = 0; int p2 = 1;
    
    while (p2 < nums.length) {
        if (nums[p1] != nums[p2]) {
            p1++;
            nums[p1] = nums[p2];
        }
        p2++;
    }
    
    return p1 + 1;
}
}
// @lc code=end