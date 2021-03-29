import java.util.ArrayList;

/*
 * @lc app=leetcode id=728 lang=java
 *
 * [728] Self Dividing Numbers
 */

// @lc code=start
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new ArrayList<>();
        for (int i = left; i<=right; i++){
            boolean f = true;
            int n = i;
            while(n!=0){
                if (n%10==0 || i%(n%10) != 0)
                    f = false;
                n/=10;
            }
            if (f)
                l.add(i);
        }
        return l;
    }
}
// @lc code=end

