/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        int ind = 0;
        for (int i = 0; i<s.length(); i++){
            int c = ind;
            for (int j = ind; j<t.length(); j++){
                if (t.charAt(j) == s.charAt(i)){
                    ind = j+1;
                    break;
                }
            }
            if (c==ind)
                return false;
        }
        return true;
    }
}
// @lc code=end

