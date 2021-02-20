/*
 * @lc app=leetcode id=228 lang=java
 *
 * [228] Summary Ranges
 */

// @lc code=start
import java.util.*;
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> r = new ArrayList<>();
        if (nums.length == 0)
            return r;
        if (nums.length == 1){
            r.add(nums[0]+"");
            return r;
        }
        String re = ""+nums[0];
        int ind = 0;
        for (int i = 1; i < nums.length; i++){
            if (ind<nums.length && nums[i]-1!=nums[i-1]){
                if (ind+1!=i)
                    r.add(nums[ind]+"->"+nums[i-1]);
                else
                    r.add(nums[ind]+"");
                ind = i;
            }
        }
        if (ind < nums.length-1)
            r.add(nums[ind]+"->"+nums[nums.length-1]);
        if (ind == nums.length-1)
            r.add(nums[ind]+"");
        return r;
    }
}
// @lc code=end

