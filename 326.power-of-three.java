/*
 * @lc app=leetcode id=326 lang=java
 *
 * [326] Power of Three
 */

// @lc code=start
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n==0)
            return false;
        double r = n;
        while(r>1)
            r/=3;
        return r==1;
    }
}
// @lc code=end

