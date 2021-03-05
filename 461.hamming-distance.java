/*
 * @lc app=leetcode id=461 lang=java
 *
 * [461] Hamming Distance
 */

// @lc code=start
class Solution {
    public int hammingDistance(int x, int y) {
        String xx = to2(x);
        String yy = to2(y);
        int r = 0;
        int l = xx.length()-1, rr = yy.length()-1;
        while(0<=l && 0<=rr){
            if (xx.charAt(l) != yy.charAt(rr))
                r++;
            l--;
            rr--;
        }
        while (rr>=0){
            if (yy.charAt(rr)=='1')
                r++;
            rr--;
        }
        while(l>=0){
            if (xx.charAt(l)=='1')
                r++;
            l--;
        }
        return r;
    }
    String to2(int n){
        String r = "";
        while(n!=0){
            r = n%2 + r;
            n/=2;
        }
        return r;
    }
}
// @lc code=end

