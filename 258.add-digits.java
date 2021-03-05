/*
 * @lc app=leetcode id=258 lang=java
 *
 * [258] Add Digits
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        while(num/10 != 0){
            int n = 0;
            while(num!=0){
                n+=num%10;
                num/=10;
            }
            num = n;
        }
        return num;
    }
}
// @lc code=end

