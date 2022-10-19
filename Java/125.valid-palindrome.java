/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        // Brute Force Approach:
        // Two-Pointer
        // pointers move towards each other
        // skips over nonalphabetic characters
        // O(n) time, O(k) space

        int p1 = 0;
        int p2 = s.length() - 1;

        while (p1 < p2) {
            // Loops to skip over non alphanumeric characters
            // stops skipping if pointers meet
            while (p1 < p2 && !((Character.toLowerCase(s.charAt(p1)) >= 97 &&
                    Character.toLowerCase(s.charAt(p1)) <= 122) || 
                    Character.isDigit(s.charAt(p1)))) {
                p1++;
            }
            while (p1 < p2 && !((Character.toLowerCase(s.charAt(p2)) >= 97 &&
                    Character.toLowerCase(s.charAt(p2)) <= 122) || 
                    Character.isDigit(s.charAt(p2)))) {
                p2--;
            }

            if (p1 < p2) {
                if (Character.toLowerCase(s.charAt(p1)) != Character.toLowerCase(s.charAt(p2)))
                    return false;
                p1++;
                p2--;
            }
        }
        return true;
    }
}
// @lc code=end
