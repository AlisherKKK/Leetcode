/*
 * @lc app=leetcode id=657 lang=java
 *
 * [657] Robot Return to Origin
 */

// @lc code=start
class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (int i = 0; i<moves.length();i++){
            char cc = moves.charAt(i);
            if (cc == 'U')
                y++;
            else if (cc == 'D')
                y--;
            else if (cc == 'L')
                x--;
            else if (cc=='R')
                x++;
        }
        return x==0 && y==0;
    }
}
// @lc code=end

