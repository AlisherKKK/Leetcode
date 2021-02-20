/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        String s = x+"";
        boolean res = true;
        for (int i = 0; i<s.length()/2; i++){
            //123321  -> i=0 1
            if (s.charAt(i) != s.charAt(s.length()-i-1))
                res = false;
        }
        return res;
    }
}
// @lc code=end

