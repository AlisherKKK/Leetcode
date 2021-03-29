import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=703 lang=java
 *
 * [703] Kth Largest Element in a Stream
 */

// @lc code=start
class KthLargest {
    List<Integer> l = new ArrayList<>();
    int K ;
    public KthLargest(int k, int[] nums) {
        K=k;
        Arrays.sort(nums);
        for (int i : nums)
            l.add(i);
    }
    
    public int add(int val) {
        l.add(find(val), val);
        return l.get(l.size()-K);
    }
    int find(int v){
        int le = 0, r = l.size();
        while(le<r){
            int m = (le+r)/2;
            if (l.get(m) < v)
                le=m+1;
            else
                r=m;
        }
        return le;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
// @lc code=end

