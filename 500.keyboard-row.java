/*
 * @lc app=leetcode id=500 lang=java
 *
 * [500] Keyboard Row
 */

// @lc code=start
class Solution {
    public String[] findWords(String[] words) {
        String[] ls = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        String r = "";
        for (String i : words){
            String newI = i.toLowerCase();
            for (int j = 0; j<3; j++){
                boolean find = true;
                for (int k = 0; k<newI.length(); k++){
                    if (!ls[j].contains(newI.charAt(k)+""))
                        find = false;
                }
                if (find)
                    r+=i+" ";
            }
            
        }
        if (r.length() == 0)
            return new String[]{};
        return r.split(" ");
    }
}
// @lc code=end

