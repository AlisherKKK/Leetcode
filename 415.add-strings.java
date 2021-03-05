/*
 * @lc app=leetcode id=415 lang=java
 *
 * [415] Add Strings
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
        String res = "";
        int rem = 0;
        int l=num1.length()-1, r = num2.length()-1;
        while(l>-1 && r>-1){
            int c = (int)(num1.charAt(l)+num2.charAt(r)-96);
            res = (c+rem)%10+res;
            rem = (c+rem)/10;
            l--;
            r--;
        }
        while(l>-1){
            int c = (int)(num1.charAt(l)-48);
            res = (c+rem)%10+res;
            rem = (c+rem)/10;
            l--;
        }
        while(r>-1){
            int c = (int)(num2.charAt(r)-48);
            res = (c+rem)%10+res;
            rem = (c+rem)/10;
            r--;
        }
        if (rem!=0)
            res="1"+res;
        return res;
    }
}
// @lc code=end

