/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
import java.util.*;
class Solution {
    public int[] plusOne(int[] digits) {
        if (digits.length == 1 && digits[0]==9)
            return new int[]{1,0};
        int[] r = new int[digits.length+1];
        for (int i = 0; i<digits.length; i++)
            r[i+1] = digits[i];
        r[digits.length]+=1;
        for (int i = r.length-1; i>0; i--){
            if (r[i] == 10){
                r[i-1]+=1;
                r[i] -= 10;
            }
        }
        if (r[0]==1)
            return r;
        
        return Arrays.copyOfRange(r, 1,r.length);
    }
}
// @lc code=end

