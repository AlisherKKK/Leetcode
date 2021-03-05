/*
 * @lc app=leetcode id=492 lang=java
 *
 * [492] Construct the Rectangle
 */

// @lc code=start
class Solution {
    public int[] constructRectangle(int area) {
        int[] r = {(int) Math.sqrt(area), (int) Math.sqrt(area)};
        while(r[0]*r[1]!=area){
            if (r[0]*r[1] > area)
                r[1]--;
            else
                r[0]++;
        }
        return r;
    }
}
// @lc code=end

