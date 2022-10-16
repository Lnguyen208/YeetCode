/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Brute Force Approach:
        // iterate over an incrementing index
        // build and return longest prefix
        // O(numberOfStr*lengthOfShortestStr) time,
        // O(lengthOfShortestString) space

        StringBuffer longestPrefix = new StringBuffer();

        while (longestPrefix.length() < strs[0].length()) {
            char currChar = strs[0].charAt(longestPrefix.length());
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() == longestPrefix.length() ||
                        strs[i].charAt(longestPrefix.length()) != currChar) {
                    return longestPrefix.toString();
                }
            }
            longestPrefix.append(currChar);
        }
        return longestPrefix.toString();
    }
}
// @lc code=end
