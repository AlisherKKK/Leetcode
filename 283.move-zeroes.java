/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length-1; i++){
            if(nums[i]!=0)
                continue;
            int  j = 0;
            for (j = i + 1; j < nums.length; j++){
                if (nums[j] != 0)
                    break;
            }
            if (j<nums.length){
                nums[i] = nums[j];
                nums[j] = 0;
            }
        }
    }
}
// @lc code=end

