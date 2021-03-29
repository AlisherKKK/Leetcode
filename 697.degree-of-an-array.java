import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=697 lang=java
 *
 * [697] Degree of an Array
 */

// @lc code=start
class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> l = new HashMap<>(), r = new HashMap<>(), a = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            int val = nums[i];
            if (l.get(val) == null)
                l.put(val, i);
            r.put(val, i);
            a.put(val, a.getOrDefault(val, 0)+1);
        }
        int max = Collections.max(a.values());
        int res = nums.length;
        for (int i : a.keySet()){
            if (a.get(i) == max)
                res = Math.min(res, r.get(i)-l.get(i)+1);
        }
        return res;

    }
}
// @lc code=end

