/*
 * @lc app=leetcode id=521 lang=java
 *
 * [521] Longest Uncommon Subsequence I
 */

// @lc code=start
class Solution {
    public int findLUSlength(String a, String b) {
        if (finder(a, b) && a.length()!=1)
            return -1;
        return Math.max(a.length(), b.length());
    }
    boolean finder(String a, String b){
        int ind = 0;
        for (int i = 0; i<a.length(); i++){
            boolean f = true;
            for (int j = ind; j<b.length(); j++){
                if (b.charAt(j) == a.charAt(i)){
                    ind = j;
                    f = false;
                    break;
                }
            }
            if (f)
                return false;
        }
        return true;
    }
}
// @lc code=end

