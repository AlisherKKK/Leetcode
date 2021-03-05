/*
 * @lc app=leetcode id=290 lang=java
 *
 * [290] Word Pattern
 */

// @lc code=start
import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap hm = new HashMap();
        String[] ss = s.split(" ");

        if (ss.length != pattern.length())
            return false;

        for (Integer i = 0; i < ss.length; i++) {
            char c = pattern.charAt(i);
            String w = ss[i];

            if (!hm.containsKey(c))
                hm.put(c, i);

            if (!hm.containsKey(w))
                hm.put(w, i);

            if (hm.get(c) != hm.get(w))
                return false;
        }

        return true;
    }
}
// @lc code=end

