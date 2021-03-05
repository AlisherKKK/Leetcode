/*
 * @lc app=leetcode id=476 lang=java
 *
 * [476] Number Complement
 */

// @lc code=start
class Solution {
    public int findComplement(int num) {
        String r = "";
        while(num!=0){
            r = (num%2==0 ? 1 : 0) + r;
            num/=2;
        }
        int s = 0;
        for (int i = r.length()-1; i>=0; i--)
            s+=Integer.parseInt(r.charAt(i)+"")*Math.pow(2, r.length()-i-1);
        return s;
    }
}
// @lc code=end

