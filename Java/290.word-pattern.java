/*
 * @lc app=leetcode id=290 lang=java
 *
 * [290] Word Pattern
 */

// @lc code=start
import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        // HashMap Approach:
        // Split string into separate words
        // Iterate pattern side by side with words in s
        // Use char as key, word as value. Check existing
        // key does not have the value that matches word
        // Make new key for char that do not exist yet
        // O(n^2) time, split String s into words & iterating pattern with String array
        // O(n) space, creating String array
        String[] words = s.split(" ");
        HashMap<Character, String> match = new HashMap<Character, String>();
        if (words.length != pattern.length()) return false;
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (!match.containsKey(c)) {
                if (!match.containsValue(words[i])) {
                    match.put(c, words[i]);
                } else
                    return false;
            } else if (!match.get(c).equals(words[i])) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
