/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        // HashMap Approach:
        // store Characters and tally of s in HashMap
        // iterate t, decrement tally's for matches
        // remove if tally becomes 0
        // return false if key does not exist
        // O(n) time, O(n) space
        // Sort Approach:
        // sort both strings then compare
        // O(n^2) time, n is length of string
        // O(number of new Strings made from sorting) space
        HashMap<Character, Integer> tally = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            Character tmp = s.charAt(i);
            if (tally.containsKey(tmp))
                tally.put(tmp, tally.get(tmp) + 1);
            else
                tally.put(tmp, 1);
        }

       for (int i = 0; i < t.length(); i++) {
            Character tmp = t.charAt(i);
            if (tally.containsKey(tmp)) {
                if (tally.get(tmp) == 1)
                    tally.remove(tmp);
                else
                    tally.put(tmp, tally.get(tmp) - 1);
            }
            else {
                return false;
            }
        } 
        return tally.isEmpty();
    }
}
// @lc code=end
