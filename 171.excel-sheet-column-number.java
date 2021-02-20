/*
 * @lc app=leetcode id=171 lang=java
 *
 * [171] Excel Sheet Column Number
 */

// @lc code=start
class Solution {
    public int titleToNumber(String s) {
        int r = 0;
        for (int i = s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            r+=(c-64) * Math.pow(26, s.length()-i-1);
        }
        return r;
    }
}
// @lc code=end

