/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int m = nums.length/2;
        for (int i : nums){
            int c = 0;
            for (int j : nums){
                if (i == j)
                    c++;
            }
            if (c > m)
                return i;
        }
        return -1;
    }
}
// @lc code=end

