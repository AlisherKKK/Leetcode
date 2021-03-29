/*
 * @lc app=leetcode id=874 lang=java
 *
 * [874] Walking Robot Simulation
 */

// @lc code=start
class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int dx = 1, dy = 0, x = 0, y = 0, res = 0;
        for (int i : commands){
            if (i == -1){
                if (dx != 0){
                    dy = dx == 1 ? 1 : -1;
                    dx = 0;
                }
                else{
                    dx = dy == 1 ? -1 : 1;
                    dy = 0;
                }
            }
            else if (i == -2){
                if (dx != 0){
                    dy = dx == 1 ? -1 : 1;
                    dx = 0;
                }
                else{
                    dx = dy == 1 ? 1 : -1;
                    dy = 0;
                }
            }else{
                for (int j = 1; j <= i; j++){
                    boolean blocked = false;
                    for (int[] k : obstacles){
                        if (k[1] == x+dx && k[0] == y+dy){
                            blocked = true;
                            break;
                        }
                    }
                    if (!blocked){
                        x+=dx;
                        y+=dy;
                    }
                    else
                        break;
                }
                res = Math.max(res,x*x+y*y);
            }
        }
        return res;
    }
}
// @lc code=end

