/*
 * @lc app=leetcode id=367 lang=java
 *
 * [367] Valid Perfect Square
 */

// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 1, r = num;
        while(l<=r){
            long m = l+(r-l)/2;
            System.out.println(m);
            if (m*m == num)
                return true;
            else if (m*m < num)
                l = (int)m+1;
            else
                r = (int)m-1;
        }
        return false;
    }
}
// @lc code=end

