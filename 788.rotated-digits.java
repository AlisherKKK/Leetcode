/*
 * @lc app=leetcode id=788 lang=java
 *
 * [788] Rotated Digits
 */

// @lc code=start
class Solution {
    public int rotatedDigits(int N) {
        int r = 0;
        for (int i = 1; i<N+1; i++){
            String s = "";
            String ii = i+"";
            for (int j = 0; j<ii.length(); j++){
                char c = ii.charAt(j);
                if (c == '1' || c == '8' || c == '0')
                    s += c;
                else if (c == '2')
                    s += "5";
                else if (c == '5')
                    s += "2";
                else if (c == '6')
                    s += "9";
                else if (c == '9')
                    s += "6";
                else
                    s += "q";
            }
            if (!s.contains("q") && !s.equals(ii))
                r++;
        }
        return r;
    }
    
}
// @lc code=end

