/*
 * @lc app=leetcode id=561 lang=java
 *
 * [561] Array Partition I
 */

// @lc code=start
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int r = 0; 
        for (int i = 0; i<nums.length;i+=2)
            r+=nums[i];
        return r;
    }
}
// @lc code=end

