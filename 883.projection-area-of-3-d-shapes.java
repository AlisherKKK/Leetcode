/*
 * @lc app=leetcode id=883 lang=java
 *
 * [883] Projection Area of 3D Shapes
 */

// @lc code=start
class Solution {
    public int projectionArea(int[][] grid) {
        int r = 0;
        for (int i = 0; i < grid.length; i++){
            int m1=0,m2=0;
            for (int j = 0; j <grid.length; j++){
                if (grid[i][j] > 0)
                    r++;
                m1=Math.max(m1,grid[i][j]);
                m2=Math.max(m2,grid[j][i]);
            }
            r+=m1+m2;
        }
        return r;
    }
}
// @lc code=end

