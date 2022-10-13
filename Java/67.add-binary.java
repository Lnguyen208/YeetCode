/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
import java.util.*;

class Solution {
    public String addBinary(String a, String b) {
        // Brute Force Approach:
        // Two Pointers starting at end of both Strings
        // Make dictionary for binary addition
        // Track carry
        // Use StringBuffer concat at beginning
        // O(n) time, O(n) space

        // dictionary for binary addition
        HashMap<Integer, String> binAdd = new HashMap<Integer, String>();
        binAdd.put(144, "0");
        binAdd.put(145, "1");
        binAdd.put(146, "0");
        binAdd.put(147, "1");

        // assigning longer String to operand 1
        String op1, op2;
        if (a.length() > b.length()) {
            op1 = a;
            op2 = b;
        } 
        else {
            op1 = b;
            op2 = a;
        }

        int p1 = op1.length() - 1;
        int p2 = op2.length() - 1;
        char carry = '0';
        StringBuffer soln = new StringBuffer();

        while (p1 >= 0) {
            int temp = op1.charAt(p1) + carry;
            temp += (p2 >= 0) ? op2.charAt(p2) : '0';
            soln.insert(0, binAdd.get(temp));
            carry = (temp < 146) ? '0' : '1';
            p1--;
            p2--;
        }
        if (carry == '1') soln.insert(0, "1");
        return soln.toString();
    }
}
// @lc code=end
