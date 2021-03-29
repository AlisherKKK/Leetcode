/*
 * @lc app=leetcode id=888 lang=java
 *
 * [888] Fair Candy Swap
 */

// @lc code=start
class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int[] r = new int[2];
        int s1 = 0, s2 = 0;
        for (int i : A)
            s1+=i;
        for (int i : B)
            s2+=i;
        for (int i : A){
            for (int j : B){
                if (s1-i+j == s2-j+i){
                    r[0] = i;
                    r[1] = j;
                    return r;
                }
            }
        }
        return r;
    }
}
// @lc code=end

