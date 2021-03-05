/*
 * @lc app=leetcode id=455 lang=java
 *
 * [455] Assign Cookies
 */

// @lc code=start
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int r = 0;
        int l = 0;
        for (int i : g){
            for (int j = l; j<s.length;j++){
                if (s[j]>=i){
                    r++;
                    l=j+1;
                    break;
                }
            }
        }
        return r;
    }
}
// @lc code=end

