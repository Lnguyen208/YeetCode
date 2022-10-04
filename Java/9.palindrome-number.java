/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        // Two Pointer Approach
        // O(n) time complexity, O(n) space complexity
        // turn input into a string, use two pointer starting from opposite ends, compare chars, converges at middle
        if (x >= 0) {
            String xStr = Integer.toString(x);
            int low = 0;
            int high = xStr.length()-1;
            
            while (low < high)
                if (xStr.charAt(low)==xStr.charAt(high)) {
                    low++;
                    high--;
                }
                else return false;
            return true;
            }
        return false;
    }
}
// @lc code=end

