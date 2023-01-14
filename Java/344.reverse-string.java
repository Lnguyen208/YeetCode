/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

// @lc code=start
import java.util.*;

class Solution {
    public void reverseString(char[] s) {
        // Two-Pointer Approach:
        // Pointer 1 at beginning, Pointer 2 at end
        // Swap characters using temp and move pointes towards
        // center
        // O(n) time, O(1) space
        // Stack Approach:
        // Push characters into stack starting from beginning
        // Pop out stack and assign to beginning of array
        // Pop while moving towards end of array
        // O(n) time, O(n) space
        Stack<Character> stck = new Stack<Character>();
        for (int i = 0; i < s.length; i++) {
            stck.push(s[i]);
        }
        int c = 0;
        while (!stck.isEmpty()) {
            s[c] = stck.pop();
            c++;
        }
    }
}
// @lc code=end
