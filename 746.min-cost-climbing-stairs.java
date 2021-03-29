/*
 * @lc app=leetcode id=746 lang=java
 *
 * [746] Min Cost Climbing Stairs
 */

// @lc code=start
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int l = 0;
        int r = 0;
        for (int i = cost.length-1; i>=0; i--){
            int c = cost[i]+Math.min(l,r);
            l = r;
            r = c;
        }
        return Math.min(l,r);
    }
}
// @lc code=end

