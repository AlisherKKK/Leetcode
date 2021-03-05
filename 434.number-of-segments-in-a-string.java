/*
 * @lc app=leetcode id=434 lang=java
 *
 * [434] Number of Segments in a String
 */

// @lc code=start
class Solution {
    public int countSegments(String s) {
        if (s.length()==0)
            return 0;
        String[] ss = s.split(" ");
        int c = 0;
        for (String i : ss){
            if (i.length()!=0)
                c++;
        }
        return c;
    }
}
// @lc code=end

