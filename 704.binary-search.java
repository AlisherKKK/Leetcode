/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length;
        while(l<r){
            int m = l + (r-l)/2;
            if (nums[m] == target)
                return m;
            else if (nums[m] < target)
                l = m+1;
            else
                r = m;
        }
        return -1;
    }
}
// @lc code=end

