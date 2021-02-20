/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */

// @lc code=start
class Solution {
    public String convertToTitle(int n) {
        String r = "";
        while(n>26){
            n--;
            r+=(char)(n%26 + 65);
            n/=26;
        }
        n--;
        r+=(char)(n%26 + 65);
        String  q = "";
        for (int i = r.length()-1; i>=0;i--)
            q+=r.charAt(i);
        return q;
    }
}
// @lc code=end

