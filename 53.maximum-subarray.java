/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = nums[0];
        for (int i = 1; i<nums.length; i++){
            sum = Math.max(nums[i], sum+nums[i]);
            res = Math.max(sum,res);
        }
        return res;
    }
}
// @lc code=end

