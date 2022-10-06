/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
import java.util.*;
class Solution {
    // Stack Approach-- Use stack to track sequence of braces to confirm if braces have correct pairs and correct front then back braces
    // O(n) time complexity, O(n) space
    public boolean isValid(String s) 
    {
        if (s.length()%2!=0) return false;
        Stack<Character> pairing = new Stack<Character>();
        int pointer = 0;

        while (pointer < s.length())
        {
            // Covers cases that are front braces
            if(s.charAt(pointer)=='('||s.charAt(pointer)=='['||s.charAt(pointer)=='{')
            {
                pairing.push(s.charAt(pointer));
                pointer++;
            }
            // Covers cases where next is a back brace
            else if(s.charAt(pointer)==')'||s.charAt(pointer)==']'||s.charAt(pointer)=='}')
            {
                if (!pairing.empty())
                {
                    if((pairing.peek()=='('&&s.charAt(pointer)==')')||(pairing.peek()=='['&&s.charAt(pointer)==']')||(pairing.peek()=='{'&&s.charAt(pointer)=='}'))
                    {
                        pairing.pop();
                        pointer++;
                    }
                    else return false;
                }
                else return false;
            }
        }
        if (!pairing.empty()) return false;
        return true;
    }
}
// @lc code=end

