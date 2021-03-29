/*
 * @lc app=leetcode id=674 lang=java
 *
 * [674] Longest Continuous Increasing Subsequence
 */

// @lc code=start
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0)
            return 0;
        int r = 1, c = 1;
        for (int i = 1; i<nums.length; i++){
            c += (nums[i]>nums[i-1] ? 1 : -(c-1));
            r = r>c?r:c;
        } 
        return r;
    }
}
// @lc code=end

