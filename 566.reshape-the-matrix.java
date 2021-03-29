/*
 * @lc app=leetcode id=566 lang=java
 *
 * [566] Reshape the Matrix
 */

// @lc code=start
class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (r*c!=nums.length*nums[0].length)
            return nums;
        int[][] res = new int[r][c];
        int row = 0, col = 0;
        for (int i = 0; i<r; i++){
            for (int j = 0; j<c;j++){
                res[i][j] = nums[row][col++];
                if (col==nums[0].length){
                    row++;
                    col = 0;
                }
            }
        }
        return res;
    }
}
// @lc code=end

