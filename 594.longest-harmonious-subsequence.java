import java.util.HashMap;

/*
 * @lc app=leetcode id=594 lang=java
 *
 * [594] Longest Harmonious Subsequence
 */

// @lc code=start
class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        int r = 0;
        for (int n : nums){
            hp.put(n, hp.getOrDefault(n, 0)+1);
            if (hp.containsKey(n+1))
                r=Math.max(r, hp.get(n)+hp.get(n+1));
            if (hp.containsKey(n-1))
                r=Math.max(r, hp.get(n)+hp.get(n-1));
        }
        return r;
    }
}
// @lc code=end

