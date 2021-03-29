/*
 * @lc app=leetcode id=696 lang=java
 *
 * [696] Count Binary Substrings
 */

// @lc code=start
class Solution {
    public int countBinarySubstrings(String s) {
        int a = 0, pr = 0 ,c = 1;
        for (int i = 1; i<s.length(); i++){
            if (s.charAt(i) != s.charAt(i-1)){
                a += Math.min(c,pr);
                pr = c;
                c = 1;
            }
            else
                c++;
        }
        return a+Math.min(pr,c);
    }
}
// @lc code=end

