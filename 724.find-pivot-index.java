/*
 * @lc app=leetcode id=724 lang=java
 *
 * [724] Find Pivot Index
 */

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {
        int s1 = 0, s2 = 0;
        for (int i = 0; i<nums.length; i++)
            s2+=nums[i];
        for (int i = 0; i<nums.length; i++){
            if (i!=0)
                s1+=nums[i-1];
            s2-=nums[i];
            if (s1 == s2)
                return i;
        }
        return -1;
    }
}
// @lc code=end

