/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 */

// @lc code=start
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 1; i < nums.length; i++){
            for (int j = 0; j < i; j++){
                if (nums[i] == nums[j] && i - j <= k)
                    return true;
            }
        }
        return false;
    }
}
// @lc code=end

