/*
 * @lc app=leetcode id=892 lang=java
 *
 * [892] Surface Area of 3D Shapes
 */

// @lc code=start
class Solution {
    public int surfaceArea(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] != 0)
                {
                    sum += grid[i][j]*6;
                    sum -= 2*(grid[i][j] -1);
                    if(i < grid.length -1)
                        sum -= 2*Math.min(grid[i][j], grid[i +1][j]);
                    if(j < grid[0].length -1)
                        sum -= 2*Math.min(grid[i][j],grid[i][j+1]);
                }
            }
        }

        return sum;
    }
}
// @lc code=end

