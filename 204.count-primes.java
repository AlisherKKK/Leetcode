/*
 * @lc app=leetcode id=204 lang=java
 *
 * [204] Count Primes
 */

// @lc code=start
class Solution {
    public int countPrimes(int n) {
        if (n<3)
            return 0;
        int r = 1;
        for (int i = 3; i<n; i+=2){
            boolean find = true;
            if (i==3){
                r++;
                continue;
            }
            if (i%2==0 || i%3 == 0)
                continue;
            for (int j = 5; j<Math.sqrt(i)+1; j+=2){
                if (i%j==0){
                    find = false;
                    break;
                }
            }
            r += find ? 1 : 0;
        }
        return r;
    }
}
// @lc code=end

