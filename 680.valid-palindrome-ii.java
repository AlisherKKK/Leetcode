/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length()-1, c=0;
        while(i<j){
            if (s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else
                break;
        }
        if (i>=j)
            return true;
        return find(s,i+1,j) || find(s, i, j-1);
    }
    boolean find(String s, int i, int j){
        while(i<j){
            if (s.charAt(i) == s.charAt(j)){
                i++;
                j--;
                continue;
            }
            return false;
        }
        return true;
    }
}
// @lc code=end

