/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
    // Brute Force Approach:
    // Track existance of carry. 
    // If carry exists after iterating and adding to every element
    // return new int array with length bigger by one than input
    // and first element of new array is 1
    // O(n) time, O(n) space
    
    int carry = 0;
    int index = digits.length - 1;

    digits[index]++;
    if (digits[index] == 10) {
        carry = 1;
        digits[index] = 0;
        index--;
    }

    while (carry == 1 && index >= 0) {
        digits[index]++;
        if (digits[index] != 10) {
            carry = 0;
        }
        else {
            digits[index] = 0;
            index--;
        }
    }

    if (carry == 1) {
        int[] carried = new int[digits.length + 1];
        carried[0] = 1;
        return carried;
    }
    return digits;
    }
}
// @lc code=end

