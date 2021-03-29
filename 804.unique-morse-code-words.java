import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=804 lang=java
 *
 * [804] Unique Morse Code Words
 */

// @lc code=start
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        List<String> l = new ArrayList<>();
        for (String i : words){
            String s = "";
            for (int j = 0; j < i.length(); j++)
                s += morse[i.charAt(j) - 97];
            if (!l.contains(s))
                l.add(s);
        }
        return l.size();
    }
}
// @lc code=end

