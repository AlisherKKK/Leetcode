/*
 * @lc app=leetcode id=122 lang=java
 *
 * [122] Best Time to Buy and Sell Stock II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int v = 0;
        int buy = prices[0];
        int sell = prices[0];
        while(v<prices.length-1){
            while(v<prices.length-1 && prices[v] > prices[v+1])
                v++;
            buy = prices[v];
            while(v<prices.length-1 && prices[v] <= prices[v+1])
                v++;
            sell = prices[v];
            res+=sell-buy;
        }
        return res;
    }
}
// @lc code=end

