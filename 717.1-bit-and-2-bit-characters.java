/*
 * @lc app=leetcode id=717 lang=java
 *
 * [717] 1-bit and 2-bit Characters
 */

// @lc code=start
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i<bits.length-1)
            i+=bits[i]+1;
        return i==bits.length-1;
    }
}
// @lc code=end

