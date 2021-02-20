/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        int p = a.length() - 1;
        int q = b.length() - 1;
        StringBuffer buf = new StringBuffer("");
        Result result = new Result();
        while(p >= 0 || q >= 0) {
            int x = p >= 0 ? a.charAt(p) - 48 : 0;
            int y = q >= 0 ? b.charAt(q) - 48 : 0;
            result = addBinary(x, y, result.cy);
            buf.append(result.ad);
            p--;
            q--;
        }
        if(result.cy != 0) {
            buf.append(result.cy);
        }
        return buf.reverse().toString();
    }
    
    
    Result addBinary(int a, int b, int c) {
        Result result = new Result();
        if(a == 0 && b == 0 && c == 0) {
        } 
        else if(a == 0 && b == 0 && c == 1) {
            result.ad = 1;
            result.cy = 0;
        } else if(a == 0 && b == 1 && c == 0) {
            result.ad = 1;
            result.cy = 0;
        } else if(a == 0 && b == 1 && c == 1) {
            result.ad = 0;
            result.cy = 1;
        } else if(a == 1 && b == 0 && c == 0) {
            result.ad = 1;
            result.cy = 0;
        } else if(a == 1 && b == 0 && c == 1) {
            result.ad = 0;
            result.cy = 1;
        } else if(a == 1 && b == 1 && c == 0) {
            result.ad = 0;
            result.cy = 1;
        } else if(a == 1 && b == 1 && c == 1) {
            result.ad = 1;
            result.cy = 1;
        }
        return result;
    }
    
    class Result {
        int ad = 0;
        int cy = 0;
    }
}
// @lc code=end

