/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */

// @lc code=start
class Solution {
    public boolean isPowerOfTwo(int m) {
        int n = m;
        if (n==1 || n==2)
            return true;
        for (int i = 1; i<m;i++){
            if (n%2!=0)
                return false;
            n/=2;
            if (n==2)
                return true;
        }
        return false;
    }
}
// @lc code=end

