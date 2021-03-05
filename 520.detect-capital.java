/*
 * @lc app=leetcode id=520 lang=java
 *
 * [520] Detect Capital
 */

// @lc code=start
class Solution {
    public boolean detectCapitalUse(String word) {
        boolean all = word.charAt(0)>=65 && word.charAt(0)<=90;
        boolean fst = all;
        boolean sml = !all;
        for (int i = 1; i < word.length(); i++){
            char c = word.charAt(i);
            if (c>=97 && c<=122 )
                all = false;
            if (c>=65 && c<=90){
                fst = false;
                sml = false;
            }
        }
        return all || fst || sml;
    }
}
// @lc code=end

