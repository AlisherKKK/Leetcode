/*
 * @lc app=leetcode id=374 lang=java
 *
 * [374] Guess Number Higher or Lower
 */

// @lc code=start
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1, r = n;
        while(l<r){
            int m = l+(r-l)/2;
            if (guess(m)==0)
                return m;
            else if (guess(m)==1)
                l = m+1;
            else
                r = m-1;
        }
        return l;
    }
}
// @lc code=end

