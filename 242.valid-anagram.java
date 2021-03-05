/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
            return false;
        int[] a = new int[26];
        for (int i = 0; i<s.length(); i++){
            a[s.charAt(i)-97]++;
            a[t.charAt(i)-97]--;
        }
        for (int i = 0; i<26;i++){
            if (a[i]!=0)
                return false;
        }
        return true;
    }
}
// @lc code=end

