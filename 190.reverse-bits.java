/*
 * @lc app=leetcode id=190 lang=java
 *
 * [190] Reverse Bits
 */

// @lc code=start
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int num = 1;
        int result = 0;
        
        for (int i = 0; i < 32; i++) {
            System.out.println(result+" "+n+" "+num+" "+" "+Integer.MIN_VALUE+" "+(Integer.MIN_VALUE >>> i));
            if ((n & num) != 0) {
                result = result | (Integer.MIN_VALUE >>> i);
            }
            
            num = num << 1;
        }
        
        return result;
    }
}
// @lc code=end

