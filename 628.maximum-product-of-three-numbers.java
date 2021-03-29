/*
 * @lc app=leetcode id=628 lang=java
 *
 * [628] Maximum Product of Three Numbers
 */

// @lc code=start
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        return Math.max(nums[l-1]*nums[l-2]*nums[l-3], nums[0]*nums[1]*nums[l-1]);
    }
}
// @lc code=end

