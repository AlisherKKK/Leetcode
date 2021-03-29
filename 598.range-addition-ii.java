/*
 * @lc app=leetcode id=598 lang=java
 *
 * [598] Range Addition II
 */

// @lc code=start
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        for (int[] op : ops){
            m = Math.min(m, op[0]);
            n = Math.min(n, op[1]);
        }
        return m*n;
    }
}
// @lc code=end

