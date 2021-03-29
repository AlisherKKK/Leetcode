/*
 * @lc app=leetcode id=812 lang=java
 *
 * [812] Largest Triangle Area
 */

// @lc code=start
class Solution {
    public double largestTriangleArea(int[][] points) {
        double res = 0;
        int  l = points.length;
        for (int i = 0; i < l-2; i++){
            for (int j = i+1; j <l-1; j++){
                for (int k = j+1; k<l;k++){
                    int x1,y1,x2,y2;
                    x1 = points[i][0] - points[j][0];
                    y1 = points[i][1] - points[j][1];
                    x2 = points[i][0] - points[k][0];
                    y2 = points[i][1] - points[k][1];
                    double area = Math.abs(x1*y2 - x2*y1)/2.0;
                    res = Math.max(res, area);
                }
            }
        }
        return res;
    }
}
// @lc code=end

