/*
 * @lc app=leetcode id=709 lang=java
 *
 * [709] To Lower Case
 */

// @lc code=start
class Solution {
    public String toLowerCase(String str) {
        String r = "";
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i)<91 && str.charAt(i)>64)
                r+=(char) (str.charAt(i)+32);
            else
                r+=str.charAt(i);
        }
        return r;
    }
}
// @lc code=end

