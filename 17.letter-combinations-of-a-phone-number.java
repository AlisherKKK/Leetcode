/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
import java.util.*;
class Solution {
    List<String> l = new ArrayList<>();
    Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
      }};
    public List<String> letterCombinations(String digits) {
        if (digits.length()!=0)
            calc("", digits);
        return l;
    }
    public void calc(String comb, String next){
        if (next.length()==0)
            l.add(comb);
        else{
            String d = next.substring(0, 1);
            String let = phone.get(d);
            for (int i = 0; i<let.length();i++){
                String lett = phone.get(d).substring(i,i+1);
                calc(comb+lett, next.substring(1));
            }
        }
    }
}
// @lc code=end

