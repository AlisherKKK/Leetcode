/*
 * @lc app=leetcode id=806 lang=java
 *
 * [806] Number of Lines To Write String
 */

// @lc code=start
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] result = new int[2];
        result[0] = 1;
        for (int i = 0; i < s.length(); i++){
            result[1] += widths[s.charAt(i) - 97];
            if (result[1] > 100){
                result[0]++;
                result[1] = widths[s.charAt(i) - 97];
            }
        }
        return result;
    }
}
// @lc code=end

