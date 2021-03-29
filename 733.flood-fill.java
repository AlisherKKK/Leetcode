/*
 * @lc app=leetcode id=733 lang=java
 *
 * [733] Flood Fill
 */

// @lc code=start
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] != newColor)
            find(image, sr,sc,image[sr][sc], newColor);
        return image;
    }
    void find(int[][] image, int sr, int sc, int col, int newColor){
        if (image[sr][sc] == col){
            image[sr][sc] = newColor;
            if (sr>0)
                find(image, sr-1, sc, col, newColor);
            if (sc>0)
                find(image, sr, sc-1, col, newColor);
            if (sr<image.length-1)
                find(image, sr+1, sc, col, newColor);
            if (sc<image[0].length-1)
                find(image, sr, sc+1, col, newColor);
        }
    }
}
// @lc code=end

