/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (n==1 && isBadVersion(n))
            return n;
        int l = 1, r = n;
        while (l<r){
            int m = l + (r-l)/2;
            if (isBadVersion(m))
                r = m;
            else
                l = m+1;
        }
        return r;
    }
}
// @lc code=end

