/*
 * @lc app=leetcode id=12 lang=java
 *
 * [12] Integer to Roman
 */

// @lc code=start
import java.util.*;

class Solution {
    public String intToRoman(int num) {
        // Dictionary and Modulo Approach:
        // Creat a HashMap dictionary to track number of modulo done,
        // actual modulo value, and Character
        // Modulo input integer and match with appropriate Character(s)
        // O(n) time, n is the number of digits in num
        // O(n) space
        HashMap<Integer, HashMap<Integer, Character>> dict = new HashMap<Integer, HashMap<Integer, Character>>();
        dict.put(0, new HashMap<Integer, Character>());
        dict.get(0).put(1, 'I');
        dict.get(0).put(5, 'V');

        dict.put(1, new HashMap<Integer, Character>());
        dict.get(1).put(1, 'X');
        dict.get(1).put(5, 'L');

        dict.put(2, new HashMap<Integer, Character>());
        dict.get(2).put(1, 'C');
        dict.get(2).put(5, 'D');

        dict.put(3, new HashMap<Integer, Character>());
        dict.get(3).put(1, 'M');

        StringBuilder soln = new StringBuilder();
        int modNum = 0;
        int mod = 0;

        while (num > 0) {
            mod = num % 10;
            if (mod == 4) {
                soln.insert(0, dict.get(modNum).get(5));
                soln.insert(0, dict.get(modNum).get(1));
            }
            else if (mod == 9) {
                soln.insert(0, dict.get(modNum + 1).get(1));
                soln.insert(0, dict.get(modNum).get(1));
            }
            else {
                boolean flag = mod > 4;
                if (flag) {
                    mod -= 5;
                }
                while (mod > 0) {
                    soln.insert(0, dict.get(modNum).get(1));
                    mod--;
                }
                if (flag) {
                    soln.insert(0, dict.get(modNum).get(5));
                }
            }
            modNum++;
            num/=10;
        }
        return soln.toString();
    }
}
// @lc code=end
