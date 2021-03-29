import java.util.Arrays;

/*
 * @lc app=leetcode id=832 lang=java
 *
 * [832] Flipping an Image
 */

// @lc code=start
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[] row;
        for (int i = 0; i < image.length; i++){
            row = new int[image.length];
            for (int j = 0; j < image.length; j++)
                row[j] = image[i][image.length-j-1] == 1 ? 0 : 1;
            image[i] = row;
        }
        return image;
    }
}
// @lc code=end

