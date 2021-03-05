/*
 * @lc app=leetcode id=463 lang=java
 *
 * [463] Island Perimeter
 */

// @lc code=start
class Solution {
    public int islandPerimeter(int[][] grid) {
        int r = grid[0][0] == 1 ? 4 : 0;
        for (int i = 1; i < grid[0].length; i++){
            int c = grid[0][i] == 1 ? 1 * 4 : 0;
            if (c!=0)
                r += c - (grid[0][i-1] == 1 ? 2 : 0);
        }
        System.out.print(r);
        for (int i = 1; i < grid.length; i++){
            int c = grid[i][0] == 1 ? 1 * 4 : 0;
            if (c!=0)
                r += c - (grid[i-1][0] == 1 ? 2 : 0);
        }
        for (int i = 1; i < grid.length; i++){
            for (int j = 1; j < grid[i].length; j++){
                if (grid[i][j] == 1)
                    r += 4 - (grid[i-1][j] == 1 ? 2 : 0) - (grid[i][j-1] == 1 ? 2 : 0);
            }
        }
        return r;
    }
}
// @lc code=end

