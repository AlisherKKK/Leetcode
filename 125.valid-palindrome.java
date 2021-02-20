/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        String r = "";
        for (int i = 0; i<s.length(); i++){
            if (Character.isLetter(s.charAt(i)))
                r+=(s.charAt(i)+"").toLowerCase();
            else if (Character.isDigit(s.charAt(i)))
                r+=(s.charAt(i)+"");
        }
        for (int i = 0; i<r.length()/2; i++){
            if (r.charAt(i)!=r.charAt(r.length()-1-i))
                return false;
        }
        return true;
    }
}
// @lc code=end

