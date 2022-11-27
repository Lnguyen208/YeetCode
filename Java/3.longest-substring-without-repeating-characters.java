/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Two-Pointer Sliding Window Approach:
        // Iterate string with pointer 2 while adding unrepeated char to hashset
        // when repeat encountered, shift pointer 1 from start and delete char at each index until
        // repeated char is deleted
        // compare length of substring with each iteration of pointer 2
        // since pointer 2 increases substring len
        // O(n) time, O(n) space
        HashSet<Character> repeats = new HashSet<Character>();
        int longestLen = 0;
        int p1 = 0;
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            while (repeats.contains(curr)) {
                repeats.remove(s.charAt(p1));
                p1++;
            }
            repeats.add(curr);
            longestLen = Math.max(longestLen, i - p1 + 1);
        }
        return longestLen;
    }
}
// @lc code=end
