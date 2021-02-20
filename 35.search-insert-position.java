/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        for(i = 0; i<nums.length; i++){
            if (target<=nums[i])
                break;
        }
        return i;
    }
}
// @lc code=end

