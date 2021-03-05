import java.awt.List;
import java.util.HashSet;

/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //use sets cause sets has no dupl's
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for (int i : nums1)
            s1.add(i);
        for (int i : nums2)
            s2.add(i);
        List<Integer> l = new ArrayList<>();
        for (int i : s1){
            if (s2.contains(i))
                l.add(i);

        }
        int[] ress = new int[l.size()];
        int ind = 0;
        for (int i : l) ress[ind++] = i;
        return ress;
    }
}
// @lc code=end

