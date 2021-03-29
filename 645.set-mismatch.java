/*
 * @lc app=leetcode id=645 lang=java
 *
 * [645] Set Mismatch
 */

// @lc code=start
class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] a = new int[2];
        a[1]=1;
        for (int i = 1; i<nums.length;i++){
            if (nums[i-1] == nums[i])
                a[0] = nums[i-1];
            else if (nums[i] > nums[i-1]+1)
                a[1] = nums[i-1]+1;
        }
        a[1] = nums[nums.length-1] == nums.length ? a[1] : nums.length;
        return a;
    }
}
// @lc code=end

