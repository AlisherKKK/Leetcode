/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 *
 * https://leetcode.com/problems/3sum-closest/description/
 *
 * algorithms
 * Medium (46.29%)
 * Likes:    2863
 * Dislikes: 165
 * Total Accepted:    550.1K
 * Total Submissions: 1.2M
 * Testcase Example:  '[-1,2,1,-4]\n1'
 *
 * Given an array nums of n integers and an integer target, find three integers
 * in nums such that the sum is closest to target. Return the sum of the three
 * integers. You may assume that each input would have exactly one solution.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [-1,2,1,-4], target = 1
 * Output: 2
 * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 =
 * 2).
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 3 <= nums.length <= 10^3
 * -10^3 <= nums[i] <= 10^3
 * -10^4 <= target <= 10^4
 * 
 * 
 */

// @lc code=start
import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0]+nums[1]+nums[2];
        for (int i = 0; i<nums.length-2; i++){
            int[] l = new int[3];
            l[0]=nums[i];
            for (int j = i+1; j<nums.length-1; j++){
                l[1]=nums[j];
                for (int k = j+1; k<nums.length; k++){
                    l[2]=nums[k];
                    int d= target - res;
                    d *= d<0?-1:1;
                    int d2 = target - l[0]-l[1]-l[2];
                    d2 *= d2<0?-1:1;
                    if (Math.abs(d)>d2)
                        res = l[1]+l[0]+l[2];
                }
            }
        }
        return res;
    }
}
// @lc code=end

