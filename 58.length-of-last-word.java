/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        String[] r = s.split(" ");
        if (r.length==0)
            return 0;
        return r[r.length-1].length();
    }
}
// @lc code=end

