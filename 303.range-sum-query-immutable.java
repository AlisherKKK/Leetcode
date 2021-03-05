/*
 * @lc app=leetcode id=303 lang=java
 *
 * [303] Range Sum Query - Immutable
 */

// @lc code=start
class NumArray {
    int[] a;
    public NumArray(int[] nums) {
        a = nums;
    }
    
    public int sumRange(int i, int j) {
        int s = 0;
        while(i<=j)
            s+=a[i++];
        return s;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
// @lc code=end

