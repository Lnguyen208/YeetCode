/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
import java.util.*;
class Solution {
    public String reverseVowels(String s) {
        // Two-Pointer Approach:
        // Two Passes: 1. Find vowel pairs to swap, 2. Concatenate all characters into a new String
        // Loop P1 until first vowel found
        // Loop P2 from the end until first vowel found
        // Create Pairing in HashMap, reset boolean to false for vowelfound for both pointers
        // Continue until center is reached
        // Create new String via iterate original and pasting chars until match found with index and 
        // HashMap occurs, use Key Value to perform swap
        // O(n) time, O(?) space (new Strings created per concatenation in 2nd pass plus HashMap of Vowels)
        int p1 = 0;
        int p2 = s.length() - 1;
        boolean p1VF = false;
        boolean p2VF = false;
        HashMap<Integer, Integer> vowels = new HashMap<Integer, Integer>();
        String soln = "";
        while (p1 < p2) {
            while (!p1VF && p1 < p2) {
                if (s.charAt(p1) == 'A' || s.charAt(p1) == 'a' ||
                s.charAt(p1) == 'E' || s.charAt(p1) == 'e' ||
                s.charAt(p1) == 'I' || s.charAt(p1) == 'i' || 
                s.charAt(p1) == 'O' || s.charAt(p1) == 'o' || 
                s.charAt(p1) == 'U' || s.charAt(p1) == 'u') {
                    p1VF = true;
                }
                else {
                    p1++;
                }
            }
            while (!p2VF && p2 > p1) {
                if (s.charAt(p2) == 'A' || s.charAt(p2) == 'a' ||
                s.charAt(p2) == 'E' || s.charAt(p2) == 'e' ||
                s.charAt(p2) == 'I' || s.charAt(p2) == 'i' || 
                s.charAt(p2) == 'O' || s.charAt(p2) == 'o' || 
                s.charAt(p2) == 'U' || s.charAt(p2) == 'u') {
                    p2VF = true;
                }
                else {
                    p2--;
                }
            }
            if (p2VF && p1VF) {
                vowels.put(p1, p2);
                vowels.put(p2, p1);
                p2VF = false;
                p1VF = false;
                p1++;
                p2--;
            }
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (vowels.containsKey(i)) {
                soln += s.charAt(vowels.get(i));
            }
            else{
                soln += s.charAt(i);
            }
        }
        return soln;
    }
}
// @lc code=end

