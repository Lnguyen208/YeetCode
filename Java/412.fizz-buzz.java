/*
 * @lc app=leetcode id=412 lang=java
 *
 * [412] Fizz Buzz
 */

// @lc code=start
import java.util.*;

class Solution {    
    public List<String> fizzBuzz(int n) {
        // Brute Force Approach:
        // iterate 1 to n, use modulo to check divisibility
        // O(n) time, O(n) space
        List<String> solution = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                solution.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                solution.add("Fizz");
            }
            else if (i % 5 == 0) {
                solution.add("Buzz");
            }
            else {
                solution.add(Integer.toString(i));
            }
        }
        return solution;
    }
}
// @lc code=end

