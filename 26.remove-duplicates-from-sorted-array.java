/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length<=1)
            return nums.length;
        int i = 0;
        //0,0,1,1,1,2,2,3,3,4
        //i=0, j = 1
        for (int j =1;j<nums.length;j++){
            if (nums[j]!=nums[i])
                nums[++i]=nums[j];
        }
        return i+1;
    }
}
// @lc code=end

