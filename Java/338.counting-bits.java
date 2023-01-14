/*
 * @lc app=leetcode id=338 lang=java
 *
 * [338] Counting Bits
 */

// @lc code=start
class Solution {
    // Two-Pointer Approach:
    // Pointer 1 is at head, Pointer 2 tracks which previous # of 1's to add
    // Identify base case: integers 0, 1, 2, 3
    // Move pointer 2 to previous position on array
    // when new higher order bit is used (ex: at n = 4, 8, 16, 32,...)
    // or at half point (Same number of 1's as lower tier in first half
    // latter half has one more compared to lower tier)
    // O(n)time , O(n) space
    public int[] countBits(int n) {
        int[] base = {0, 1, 1, 2};
        int[] soln = new int[n + 1];

        // Copy from base case for n values less than 4
        if (n < 4) {
            for (int i = 0; i < soln.length; i++) {
                soln[i] = base[i];
            }
            return soln;
        }

        int diff = 2; // # of values in between lower & higher order bit
        int halfP = 0; // + 0 for lwr half, + 1 for upper half
        int start = 4; // Track where new higher order bit begins
        int p2 = start - diff;

        for (int i = 0; i < 4; i++) {
            soln[i] = base[i];
        }

        for (int p1 = 4; p1 < (n + 1); p1++) {
            soln[p1] = soln[p2] + halfP;
            p2++;
            if (p2 == start) {
                // reset iteration of lower tier to add extra 1
                if (halfP == 0) {
                    halfP = 1;
                    p2 = start - diff;
                }
                // all halves are completed, move to higher bit
                else {
                    halfP = 0;
                    diff = diff << 1;
                    start = p1 + 1;
                    p2 = start - diff;
                }
            }
        }
        return soln;
    }
}
// @lc code=end

