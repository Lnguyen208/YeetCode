/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
    // Dynamic Programming--Two Pointer Approach
    // Iterate String. Use current index as mid point and check
    // characters laterally from midpoint until not equal
    // choose max length, track the max's left and right indices
    // O(n * m) time, O(n) space
        String soln = "";
        int leftInd, rightInd;
        int resLftInd = 0;
        int resRghtInd = 0;
        int subLen = 0;
        
        // Odd len
        for (int i = 0; i < s.length(); i++) {
            leftInd = i;
            rightInd = i;
            while (leftInd >= 0 && rightInd < s.length() &&
                s.charAt(leftInd) == s.charAt(rightInd)) {
                    if(subLen < (rightInd - leftInd)) {
                        subLen = rightInd - leftInd;
                        resLftInd = leftInd;
                        resRghtInd = rightInd;
                    };
                    leftInd--;
                    rightInd++;
            }
        }

        // Even len
        for (int i = 0; i < s.length(); i++) {
            leftInd = i;
            rightInd = i + 1;
            while (leftInd >= 0 && rightInd < s.length() &&
                s.charAt(leftInd) == s.charAt(rightInd)) {
                    if(subLen < (rightInd - leftInd)) {
                        subLen = rightInd - leftInd;
                        resLftInd = leftInd;
                        resRghtInd = rightInd;
                    };
                    leftInd--;
                    rightInd++;
            }
        }
        for (int i = resLftInd; i <= resRghtInd; i++) {
            soln += s.charAt(i);
        }
        return soln;
    }
}
// @lc code=end

