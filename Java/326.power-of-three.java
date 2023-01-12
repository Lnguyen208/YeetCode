/*
 * @lc app=leetcode id=326 lang=java
 *
 * [326] Power of Three
 */

// @lc code=start

class Solution {
    public boolean isPowerOfThree(int n) {
        // Brute Force Approach:
        // Check if n is negative or zero and return false if so
        // Positive 3 to the power of anything will not result in a negative
        // Continually divide by 3 while the modulus is 0
        // Return whether the final value of n is equal to 1
        // O(log3(n)) time, O(1) space
        // Math Approach:
        // Use math class log function
        // O(Unknown) time, Blackbox implementations;
        // O(1) space
        // Limitations of Integers Approach:
        // Use the highest possible value a signed integer can represent
        // and calculate the maximum exponent that can exist for base 3
        // Use modulus to determine if n is a factor of the 3^max exponent
        // O(1) time, O(1) space
        return (n > 0) && (1162261467 % n == 0);
    }
}
// @lc code=end
