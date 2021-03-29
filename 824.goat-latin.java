/*
 * @lc app=leetcode id=824 lang=java
 *
 * [824] Goat Latin
 */

// @lc code=start
class Solution {
    public String toGoatLatin(String S) {
        String res = "";
        String vow = "AaEeUuIiOo";
        int ind = 1;
        for (String i : S.split(" ")){
            if (vow.contains(i.charAt(0)+""))
                res+=i;
            else
                res+=i.substring(1) + i.charAt(0);
            res+="ma";
            for (int j = 0; j < ind; j++)
                res+="a";
            res+=" ";
            ind++;
        }
        return res.substring(0,res.length()-1);
    }
}
// @lc code=end

