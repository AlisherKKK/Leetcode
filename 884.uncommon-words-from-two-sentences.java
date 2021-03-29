import java.util.HashMap;

/*
 * @lc app=leetcode id=884 lang=java
 *
 * [884] Uncommon Words from Two Sentences
 */

// @lc code=start
class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String i : A.split(" "))
            map.put(i, map.getOrDefault(i,0) + 1);
        for (String i : B.split(" "))
            map.put(i, map.getOrDefault(i,0) + 1);
        int c = 0;
        for (String i : map.keySet()){
            if (map.get(i) == 1)
                c++;
        }
        int ind = 0;
        String[] r = new String[c];
        for (String i : map.keySet()){
            if (map.get(i) == 1)
                r[ind++] = i;
        }
        return r;
    }
}
// @lc code=end

