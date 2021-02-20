/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        if (strs.length == 0)
            return res;
        int m = 200;
        for (String s : strs){
            if (s.length()<m)
                m=s.length();
        }
        for (int i = 0; i<m; i++){
            boolean check = true;
            for (int j = 0; j<strs.length-1; j++){
                if (strs[j].charAt(i)!=strs[j+1].charAt(i))
                    check = false;
            }
            if (check)
                res+=strs[0].charAt(i);
            else 
                break;
        }
        return res;
    }
}
// @lc code=end

