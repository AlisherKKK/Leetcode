/*
 * @lc app=leetcode id=747 lang=java
 *
 * [747] Largest Number At Least Twice of Others
 */

// @lc code=start
class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length<2)
            return 0;
        int m = 0, sm = 0;
        for (int i = 0; i<nums.length; i++){
            if (nums[m]<nums[i])
                m=i;
            if (nums[sm]>nums[i])
                sm = i;
        }
        for (int i = 0; i<nums.length; i++){
            if (nums[i] >= nums[sm] && nums[i]!=nums[m])
                sm = i;
        }
        return nums[sm]*2<=nums[m] ? m : -1;
    }
}
// @lc code=end

