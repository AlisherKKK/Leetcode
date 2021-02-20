import java.util.ArrayList;

/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows==0){
            return res;
        }
        List<Integer> l = new ArrayList<>();
        l.add(1);
        res.add(l);
        if (numRows==1)
            return res;
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(1);
        res.add(a);
        for (int i = 2; i<numRows; i++){
            List<Integer> ll = new ArrayList<>();
            ll.add(1);
            for (int j = 1; j<i; j++)
                ll.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
            ll.add(1);
            res.add(ll);
        }
        return res;
    }
}
// @lc code=end

