/*
 * @lc app=leetcode id=38 lang=java
 *
 * [38] Count and Say
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        if (n==1)
            return "1";
        String r = "1";
        for (int i = 1; i<n;i++){
            String t = "";
            int prev = -1;
            int c = 0;
            for (int j = 0; j<r.length();j++){
                int cur = Integer.parseInt(r.charAt(j)+"");
                if (cur == prev)
                    c++;
                else if (prev==-1){
                    c++;
                    prev = cur;
                }else{
                    t += c+""+prev;
                    prev = cur;
                    c=1;
                }
            }
            t+=c+""+prev;
            r=t;
        }
        return r;
    }
}
// @lc code=end

