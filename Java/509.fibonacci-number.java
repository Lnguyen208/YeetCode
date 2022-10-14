import javax.lang.model.util.ElementScanner6;

/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {
    public int fib(int n) {
    // Brute Force: 
    // Interate using for loop to compute
    // Recursion: 
    // Base case-- n = 1 or n = 2
    // O(2^n) time, O(call stack?) space
        if (n == 0) return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        else   
            return fib(n-1) + fib(n-2);
    }
}
// @lc code=end

