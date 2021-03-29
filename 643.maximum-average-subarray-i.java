/*
 * @lc app=leetcode id=643 lang=java
 *
 * [643] Maximum Average Subarray I
 */

// @lc code=start
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int r = 0;
        for (int i = 0; i<k;i++)
            r+=nums[i];
        int cur = r;
        for (int i = 1; i<nums.length-k+1; i++){
            cur = cur-nums[i-1]+nums[i+k-1];
            r = Math.max(r,cur);
        }
        return r*1.0/k;
    }
}
// @lc code=end

