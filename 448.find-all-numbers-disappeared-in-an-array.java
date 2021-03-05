/*
 * @lc app=leetcode id=448 lang=java
 *
 * [448] Find All Numbers Disappeared in an Array
 */

// @lc code=start
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> al = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            if (nums[Math.abs(nums[i])-1]>0)
                nums[Math.abs(nums[i])-1]*=-1;
        }
        for(int i=0; i<n; i++){
            if(nums[i] > 0){
                al.add(i+1);
            }
        }
        return al;
    }
}
// @lc code=end

