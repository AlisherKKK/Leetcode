/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        String res = "";
        String open = "([{";
        String close = ")]}";

        for (int i = 0; i<s.length(); i++){
            if (res.length() == 0 && close.contains(s.charAt(i)+""))
                return false;
            if (open.contains(s.charAt(i)+""))
                res+=s.charAt(i);
            else{
                if (open.contains(res.charAt(res.length()-1)+"")){
                    if (open.indexOf(res.charAt(res.length()-1)+"") ==
                        close.indexOf(s.charAt(i)+""))
                        res = res.substring(0, res.length()-1);
                    else
                        res+=s.charAt(i);
                }
            }
        }
        return res.length() == 0;


    }
}
// @lc code=end

