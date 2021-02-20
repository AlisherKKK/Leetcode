/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */

// @lc code=start
import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combinationSum(0, candidates, target, new ArrayList<>(), result);
        return result;
    }
    private void combinationSum(int i, int[] candidates, int target, List<Integer> comb, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(comb));
        }
        else{
            for (int j = i; j < candidates.length; j++) {
                if (candidates[j] > target) continue;
                comb.add(candidates[j]);
                combinationSum(j, candidates, target - candidates[j], comb, result);
                comb.remove(comb.size() - 1);
            }
        }
    }
}
// @lc code=end

