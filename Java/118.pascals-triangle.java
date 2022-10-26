/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Queue Approach:
        // Uses queue to hold values from previous lists already created
        // Use method to return list from 1 to n, reusing same queue for
        // summing 2 previous values into 1 value for new list index
        // O(number of rows desired * elements in longest row) time, 
        // O(number of rows desired) space

        List<List<Integer>> solution = new ArrayList<>();
        Queue<Integer> nums = new LinkedList<Integer>();
        int currRow = 1;
        while (currRow <= numRows) {
            solution.add(helper(nums, currRow));
            currRow++;
        }
        return solution;
    }

    static ArrayList<Integer> helper(Queue<Integer> nums, int level) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < level - 1; i++) {
            if (i == 0) {
                list.add(1);
                nums.add(1);
            }

            else {
                int sum = nums.poll() + nums.peek();
                list.add(sum);
                nums.add(sum);
            }
        }
        list.add(1);
        return list;
    }
}
// @lc code=end
