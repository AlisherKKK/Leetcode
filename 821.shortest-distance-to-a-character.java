/*
 * @lc app=leetcode id=821 lang=java
 *
 * [821] Shortest Distance to a Character
 */

// @lc code=start
class Solution {
    public int[] shortestToChar(String s, char c) {
        int last = s.length(), next = 0;
        int[] res = new int[s.length()];
        for (int i = 0; i<s.length();i++){
            char cc = s.charAt(i);
            if (cc == c)
                last = i;
            for (int j = i; j < s.length(); j++){
                if (s.charAt(j) == c){
                    next = j;
                    break;
                }
            }
            res[i] = Math.min(Math.abs(i - last), Math.abs(next - i));
        }
        return res;
    }
}
// @lc code=end

