/*
 * @lc app=leetcode id=507 lang=java
 *
 * [507] Perfect Number
 */

// @lc code=start
class Solution {
    public boolean checkPerfectNumber(int num) {
        int r = 0;
        for (int i = 1; i<num/2+1; i++){
            r += num % i == 0 ? i:0;
            if (r>num)
                return false;
        }
        return num == r;
    }
}
// @lc code=end

