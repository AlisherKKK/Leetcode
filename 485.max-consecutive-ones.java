/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int r = 0, s = 0;
        for (int i : nums){
            s+=i;
            if (i == 0)
                s=0;
            r=Math.max(r,s);
        }
        return r;
    }
}
// @lc code=end

