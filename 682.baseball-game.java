import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=682 lang=java
 *
 * [682] Baseball Game
 */

// @lc code=start
class Solution {
    public int calPoints(String[] ops) {
        List<Integer> l = new ArrayList<>();
        for (String i : ops){
            if (i.equals("C"))
                l.remove(l.size()-1);
            else if (i.equals("D"))
                l.add(l.get(l.size()-1) * 2);
            else if (i.equals("+"))
                l.add(l.get(l.size()-1) + l.get(l.size()-2));
            else
                l.add(Integer.parseInt(i));
        }
        int[] r = {0};
        l.stream().forEach(e->r[0]+=e);
        return r[0];
    }
}
// @lc code=end

