/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        String r = "";
        String v = "";
        for (int i = 0; i<s.length(); i++){
            if ("AaEeIiOoUu".contains(s.charAt(i)+""))
                v+=s.charAt(i);
        }
        int ind = v.length()-1;
        for (int i = 0; i<s.length(); i++){
            if (v.contains(s.charAt(i)+""))
                r+=v.charAt(ind--);
            else
                r+=s.charAt(i);
        }
        return r;
    }
}
// @lc code=end

