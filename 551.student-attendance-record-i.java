/*
 * @lc app=leetcode id=551 lang=java
 *
 * [551] Student Attendance Record I
 */

// @lc code=start
class Solution {
    public boolean checkRecord(String s) {
        char cc = s.charAt(0);
        int abss = cc=='A' ? 1:0;
        int r =  cc=='L' ? 1:0;
        for (int i = 1; i<s.length(); i++){
            if (s.charAt(i)=='A')
                abss++;
            if (s.charAt(i) == 'L')
                r++;
            else
                r=0;
            if (abss>1 || r>2)
                return false;
        }
        return true;
    }
}
// @lc code=end

