/*
 * @lc app=leetcode id=844 lang=java
 *
 * [844] Backspace String Compare
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String S, String T) {
        return f(S).equals(f(T));
    }
    String f(String s){
        String r = "";
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '#')
                r = r.substring(0,Math.max(0, r.length()-1));
            else{
                r+=s.charAt(i);
            }
        }        
        return r;
    }
}
// @lc code=end

