/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
import java.util.*;

class Solution {
    public int romanToInt(String s) {
        // Brute Force Approach:
        // Create Dictionary, iterate input, check every char with dictionary, track previous char for special case
        // O(n) time, O(k) space

        HashMap<Character, Integer> dictionary = new HashMap<Character, Integer>() {
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };
        int sum = 0;
        int previousNum = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            int currentNum = dictionary.get(s.charAt(i));
            if (previousNum < currentNum) {
                sum += (previousNum * -2) + currentNum;
            } else {
                sum += currentNum;
            }
            previousNum = currentNum;
        }
        return sum;
    }
}
// @lc code=end
