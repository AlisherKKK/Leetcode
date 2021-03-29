/*
 * @lc app=leetcode id=852 lang=java
 *
 * [852] Peak Index in a Mountain Array
 */

// @lc code=start
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int r = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i - 1] > arr[i])
                break;
            r++;
        }
        return r;
    }
}
// @lc code=end

