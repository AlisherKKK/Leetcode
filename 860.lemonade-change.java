import java.util.ArrayList;

/*
 * @lc app=leetcode id=860 lang=java
 *
 * [860] Lemonade Change
 */

// @lc code=start
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f = 0, t = 0;
        for (int i : bills){
            if (i == 5)
                f++;
            else if (i == 10){
                f--;
                t++;
                if (f<0)
                    return false;
            }
            else{
                if ((f>2 && t!=0) || (t!=0 && f!=0)){
                    t--;
                    f--;
                }
                else if (f>2)
                    f-=3;
                else 
                    return false;
            }
        }
        return true;
    }
}
// @lc code=end

