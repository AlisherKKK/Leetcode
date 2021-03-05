/*
 * @lc app=leetcode id=506 lang=java
 *
 * [506] Relative Ranks
 */

// @lc code=start
class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] r = new String[score.length];
        for (int i = 0; i<score.length; i++){
            int c = 0;
            for (int j = 0; j<score.length; j++)
                c += score[i] < score[j] ? 1 : 0; 
            if (c == 0)
                r[i] = "Gold Medal";
            else if (c == 1)
                r[i] = "Silver Medal";
            else if (c == 2)
                r[i] = "Bronze Medal";
            else
                r[i] = (c+1) +"";
        }
        return r;        
    }
}
// @lc code=end

