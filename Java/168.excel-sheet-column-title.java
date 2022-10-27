/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */

// @lc code=start

class Solution {
    public String convertToTitle(int columnNumber) {
    // Dictionary and Modulus Approach:
    // Create dictionary from 0-25 where 0 represents 'Z' and 
    // 1-25 represents A-Y
    // Find modulus, match to key, then concatenate to front
    // of String. Continue while number > 0
    // O(n) time, O(n) space where n is the output string length
    // ASCII and Modulus Approach:
    // Like Dictionary except use the ASCII chart instead
    // O(n) time, O(n) space where n is the output string length
        
        StringBuffer soln = new StringBuffer();
        int mod = 0;
        while(columnNumber > 0) {
            columnNumber--;
            mod = (columnNumber) % 26;
            soln.insert(0, (char)('A' + (mod)));
            columnNumber /= 26;
        }
        return soln.toString();
    }
}
// @lc code=end

