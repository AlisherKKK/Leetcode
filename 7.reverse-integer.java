/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        String s = x+"";
        String rev = "";
        for (int i = s.length()-1; i>=0; i--)
            rev+=s.charAt(i);
        // 321-
        try{
            if (rev.charAt(rev.length()-1) == '-'){
                int r = Integer.parseInt(rev.substring(0,rev.length()-1));
                return r*(-1);
            }
                
            return Integer.parseInt(rev);
        }
        catch(Exception e){
            return 0;
        }
    }
}
// @lc code=end

