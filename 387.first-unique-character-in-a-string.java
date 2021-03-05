/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        if (s.length() < 2)
            return s.length()-1;
        String repeats = "";
        for (int i = 0; i < s.length()-1; i++) {
            if (!s.substring(i + 1).contains(s.charAt(i) + "") && !repeats.contains(s.charAt(i)+""))
                return i;
            repeats += s.charAt(i);
        }
        return repeats.contains(s.charAt(s.length()-1)+"") ? -1 : s.length()-1;
    }
}
// @lc code=end

