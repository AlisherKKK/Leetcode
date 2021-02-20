import java.util.Arrays;

/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        int  w = 0;
        int ne = n;
        while (true){
            String[] s = (ne+"").split("");
            int re = 0;
            System.out.println(Arrays.toString(s));
            for (String i : s)
                re += Math.pow(Integer.parseInt(i),2);
            if (re == 1)
                return true;
            ne = re;
            if (w++>100)
                break;
        }
        return false;
    }
}
// @lc code=end

