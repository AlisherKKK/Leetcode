/*
 * @lc app=leetcode id=119 lang=java
 *
 * [119] Pascal's Triangle II
 */

// @lc code=start
import java.util.*;
class Solution {
    public List<Integer> getRow(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.add(1);
        res.add(l);
        if (numRows==0)
            return res.get(0);
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(1);
        res.add(a);
        for (int i = 2; i<numRows+1; i++){
            List<Integer> ll = new ArrayList<>();
            ll.add(1);
            for (int j = 1; j<i; j++)
                ll.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
            ll.add(1);
            res.add(ll);
        }
        return res.get(res.size()-1);
    }
}
// @lc code=end

