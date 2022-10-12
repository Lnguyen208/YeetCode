/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
    // Brute Force Approach:
    // Two seperate loops--
    // - First determines first letter preceding unknown number of spaces
    // - Second carries on from position of first loop
    //   and determines location of space preceding last word
    // O(n) time, O(k) space
    
    int spaces = -1;
    int lastW = -1; 
    int inputLen = s.length();
    int i = inputLen-1;
     
    while (spaces == -1 && i >= 0) {
        if (s.charAt(i) != ' ') spaces = i;
        i--;
    }

    // no spaces found, whole string is word
    if (spaces == -1) return inputLen;
    
    while (lastW == -1 && i >= 0) {
        if (s.charAt(i) == ' ') lastW = i;
        i--;
    }

    return spaces - lastW;
    }
}
// @lc code=end

