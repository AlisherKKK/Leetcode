/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        int[] a = new int[26];
        for (int i = 0; i<s.length(); i++){
            a[s.charAt(i)-97]--;
            a[t.charAt(i)-97]++;
        }
        for (int i = s.length(); i<t.length();i++){
            a[t.charAt(i)-97]++;
        }
        for (int i = 0;i < 26; i++){
            if (a[i]!=0)
                return (char) (i+97);
        }
        return 'a';
    }
}
// @lc code=end

