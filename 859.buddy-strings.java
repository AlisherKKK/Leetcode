/*
 * @lc app=leetcode id=859 lang=java
 *
 * [859] Buddy Strings
 */

// @lc code=start
class Solution {
    public boolean buddyStrings(String a, String b) {
        if (a.length() != b.length())
            return false;
        if (a.equals(b)){
            for (int i = 0; i < a.length(); i++){
                if (a.substring(i+1).indexOf(a.charAt(i))!=-1)
                    return true;
            }
            return false;
        }
        int ind = 0;
        int[] l = new int[2];
        for (int i = 0; i < a.length(); i++){
            if (a.charAt(i) != b.charAt(i)){
                if (ind<2)
                    l[ind] = i;
                ind++;
                if (ind==3)
                    return false;
            }
        }
        return a.charAt(l[0]) == b.charAt(l[1]) && a.charAt(l[1]) == b.charAt(l[0]);
    }
}
// @lc code=end

