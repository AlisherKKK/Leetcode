/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int[][] a = new int[nums.length][2];

        for (int i = 0; i<a.length; i++){
            int j = 0;
            for ( j = 0; j<a.length; j++){
                if (a[j][0] == nums[i])
                    break;
            }
            if (j==a.length){
                a[i][1]++;
                a[i][0] = nums[i];
            }
            else
                a[j][1]++;
        }
        for (int[] i : a){
            if (i[1] == 1)
                return i[0];
        }
        return -1;
    }
}
// @lc code=end

