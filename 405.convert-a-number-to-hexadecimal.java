/*
 * @lc app=leetcode id=405 lang=java
 *
 * [405] Convert a Number to Hexadecimal
 */

// @lc code=start
class Solution {
    public String toHex(int num) {
        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder sb = new StringBuilder();
        if(num == 0)
            return "0";
        while(num != 0){
            char res = map[num & 15];
            num = num >>> 4;
            sb.insert(0, res);
        }
        return sb.toString();  
    }
}
// @lc code=end

