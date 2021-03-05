/*
 * @lc app=leetcode id=459 lang=java
 *
 * [459] Repeated Substring Pattern
 */

// @lc code=start
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        String r = "";
        for (int i = 0; i<l/2;i++){
            r+=s.charAt(i);
            boolean find = true;
            int j = r.length();
            for ( j = r.length(); j+r.length()<=l;j+=r.length()){
                if (!r.equals(s.substring(j, j+r.length()))){
                    find=false;
                    break;
                }
            }
            find = j == l ? find : false;
            if (find)
                return true;
        }
        return false;
    }
}
// @lc code=end

