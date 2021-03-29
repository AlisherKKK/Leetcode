import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=819 lang=java
 *
 * [819] Most Common Word
 */

// @lc code=start
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        paragraph =  paragraph.toLowerCase();
        String word = "";
        for (int i = 0; i < paragraph.length(); i++){
            if (Character.isLetter(paragraph.charAt(i)))
                word+=paragraph.charAt(i);
            else if (word.length()!=0){
                map.put(word, map.getOrDefault(word, 0) + 1);
                word = "";
            }
        }
        if (word.length()!=0)
            map.put(word, map.getOrDefault(word, 0) + 1);
        String res = word;
        for (String i : banned)
            map.remove(i);
        int r = 0;
        for (String i : map.keySet()){
            if (r < map.get(i)){
                res = i;
                r = map.get(i);
            }
        }
        return res;
    }
}
// @lc code=end

