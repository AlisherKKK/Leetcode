/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[] a = new int[n+1];
        for (int i : nums) 
            a[i]++;
        for (int i = 0; i<n+1; i++){
            if (a[i]==0)
                return i;
        }
        return -1;
    }
}
// @lc code=end

