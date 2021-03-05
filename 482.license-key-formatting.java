/*
 * @lc app=leetcode id=482 lang=java
 *
 * [482] License Key Formatting
 */

// @lc code=start
class Solution {
    public String licenseKeyFormatting(String S, int K) {
        String r = "";
        int c = 0;
        for (int i = S.length()-1; i>=0;i--){
            char cc = S.charAt(i);
            if (cc!='-'){
                if (cc>=97 && cc<=122)
                    r=(char)(cc-32)+r;
                else
                    r=cc+r;
                c++;
                if (c%K==0)
                    r="-"+r;
            }
        }
        for (int i = 0; i<r.length(); i++){
            if (r.charAt(i)!='-')
                return r.substring(i);
        }
        return r;
            
    }
}
// @lc code=end

