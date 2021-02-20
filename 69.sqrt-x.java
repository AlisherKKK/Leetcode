/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if (x<2)
            return x;
        int l = 1, r = x;
        while (l<=r){
            int m = l + (r-l)/2;
            if (m<x/m)
                l=m+1;
            else if (m>x/m)
                r=m-1;
            else 
                return m;
        }
        System.out.print("2");
        return r; 
    }
}
// @lc code=end

