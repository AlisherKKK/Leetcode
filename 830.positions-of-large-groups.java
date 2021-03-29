import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
 * @lc app=leetcode id=830 lang=java
 *
 * [830] Positions of Large Groups
 */

// @lc code=start
class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> r = new ArrayList<>();
        int st = 0, end = 0;
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) == s.charAt(i-1))
                end++;
            else{
                if (end - st > 1)
                    r.add(Arrays.asList(new Integer[]{st,end}));
                st = end+1;
                end = st;
            }
        }
        if (end-st>1)
            r.add(Arrays.asList(new Integer[]{st,end}));
        return r;
    }
}
// @lc code=end

