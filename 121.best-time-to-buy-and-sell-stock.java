/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int r = 0, m = prices[0];
        for (int i = 1; i<prices.length; i++){
            r = Math.max(r, prices[i]-m);
            m = Math.min(m, prices[i]);
        }
        return r;
    }
}
// @lc code=end

