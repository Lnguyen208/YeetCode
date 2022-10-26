/*
 * @lc app=leetcode id=119 lang=java
 *
 * [119] Pascal's Triangle II
 */

// @lc code=start
import java.util.*;
class Solution {
    public List<Integer> getRow(int rowIndex) {
        // Queue Approach:
        // Like Pascal's Triangle I without helper method
        // Track position of dequeuing to find position
        // of list desired then dequeue all into returning list
        // O(n) time, O(n) space
        Queue<Integer> nums = new LinkedList<Integer>();
        List<Integer> soln = new ArrayList<Integer>();
        int start1 = 0;

        while (start1 < rowIndex) {
            int start2 = start1;  
            nums.add(1);

            while(start2 > 0) { 
                int sum = nums.poll() + nums.peek();
                nums.add(sum);
                start2--;
            }
            start1++;
        }

        while (!nums.isEmpty()) {
                soln.add(nums.poll());
        }
        soln.add(1);
        return soln;
    }
}
// @lc code=end

