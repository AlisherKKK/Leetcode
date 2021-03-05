/*
 * @lc app=leetcode id=504 lang=java
 *
 * [504] Base 7
 */

// @lc code=start
class Solution {
    public String convertToBase7(int num) {
        if (num == 0)
            return "0";
        boolean m = num<0;
        num = num>0?num:(-1*num);
        String r = "";
        while(num!=0){
            r=num%7+r;
            num/=7;
        }
        if (m)
            r="-"+r;
        return r;
    }
}
// @lc code=end

