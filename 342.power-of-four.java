/*
 * @lc app=leetcode id=342 lang=java
 *
 * [342] Power of Four
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n==0)
            return false;
        double r = n;
        while(r>1)
            r/=4;
        if (r==1)
            return true;
        return false;
    }
}
// @lc code=end

