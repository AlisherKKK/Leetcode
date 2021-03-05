/*
 * @lc app=leetcode id=441 lang=java
 *
 * [441] Arranging Coins
 */

// @lc code=start
class Solution {
    public int arrangeCoins(int n) {
        int i = 1;
        for (i = 1; n>=0; i++){
            n-=i;
        }
        return i-2;
    }
}
// @lc code=end

