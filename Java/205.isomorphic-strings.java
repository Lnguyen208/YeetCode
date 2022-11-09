/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */

// @lc code=start
import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        // HashMap Approach:
        // Map letters in s to letters in t
        // If letter in s exist, check if letter in t matches value
        // check if value t is in map when letter in s is not a key
        // O(n) time where n is the length of s or t, O(n) space

        int i = 0;
        boolean soln = true;
        HashMap<Character, Character> oneToOne = new HashMap<Character, Character>();

        if (s.length() != t.length())
            soln = false;
        
        while (soln && i < s.length()) {
            if (!oneToOne.containsKey(s.charAt(i)) && 
                    oneToOne.containsValue(t.charAt(i))){
                soln = false;
            }
            else if (oneToOne.containsKey(s.charAt(i))) {
                soln = t.charAt(i) == oneToOne.get(s.charAt(i));
            }
            oneToOne.put(s.charAt(i), t.charAt(i));
            i++;
        }

        return soln;
    }
}
// @lc code=end
