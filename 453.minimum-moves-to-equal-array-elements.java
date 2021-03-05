/*
 * @lc app=leetcode id=453 lang=java
 *
 * [453] Minimum Moves to Equal Array Elements
 */

// @lc code=start
class Solution {
    public int minMoves(int[] nums) {
        int m = nums[0];
        for (int i : nums)
            m = Math.min(m,i);
        int r = 0;
        for (int i : nums)
            r+=i-m;
        return r;
    }
}
// @lc code=end

