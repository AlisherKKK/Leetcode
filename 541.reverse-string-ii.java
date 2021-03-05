/*
 * @lc app=leetcode id=541 lang=java
 *
 * [541] Reverse String II
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {
        String r = "";
        for (int i = 0; i<s.length(); i+=2*k){
            String rr = "";
            for (int j = i; j<i+k; j++){
                if (j<s.length())
                    rr = s.charAt(j)+rr;
            }
            r+=rr;
            for (int j = i+k; j<i+2*k; j++){
                if (j<s.length())
                    r+=s.charAt(j);
            }
        }
        return r;
    }
}
// @lc code=end

