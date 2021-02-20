/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i<s.length(); i++){
            if (i!=s.length()-1){
                if (toInt(s.charAt(i)) < toInt(s.charAt(i+1))){
                    //xivi
                    res+=toInt(s.charAt(i+1))-toInt(s.charAt(i));
                    i++;
                }
                else
                    res+=toInt(s.charAt(i));
            }
            else
                res+=toInt(s.charAt(i));
        }
        return res;
    }
    int toInt(char c){
        if (c=='I')
            return 1;
        else if (c=='V')
            return 5;
        else if (c=='X')
            return 10;
        else if (c=='L')
            return 50;
            else if (c=='C')
            return 100;
        else if (c=='D')
            return 500;
        return 1000;
    }
}
// @lc code=end

