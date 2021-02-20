/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if (n<4)
            return n;
        int pr = 2, cur = 3;
        for (int i = 4; i<=n; i++){
            int t = cur;
            cur+=pr;
            pr=t;
        }
        return cur;
    }
}
// @lc code=end

