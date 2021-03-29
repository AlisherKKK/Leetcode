/*
 * @lc app=leetcode id=557 lang=java
 *
 * [557] Reverse Words in a String III
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        String r = "";
        for (String i : s.split(" ")){
            String rr = "";
            for (int j = 0; j<i.length(); j++){
                rr = i.charAt(j)+rr;
            }
            r+=rr+" ";
        }
        return r.substring(0,r.length()-1);
    }
}
// @lc code=end

