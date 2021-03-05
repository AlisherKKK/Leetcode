/*
 * @lc app=leetcode id=496 lang=java
 *
 * [496] Next Greater Element I
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] r = new int[nums1.length];
        int ind = 0;
        for (int i : nums1){
            int p = 0;
            for (int j = 0; j<nums2.length; j++){
                if (nums2[j] == i){
                    p = j;
                    break;
                }
            }
            for (int j = p; j<nums2.length; j++){
                if (nums2[j] > i){
                    p = j;
                    break;
                }
            }
            if (nums2[p]>i)
                r[ind++] = nums2[p];
            else
                r[ind++] = -1;
        }
        return r;
    }
}
// @lc code=end

