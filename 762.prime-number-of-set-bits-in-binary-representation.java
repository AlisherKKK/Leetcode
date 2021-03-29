/*
 * @lc app=leetcode id=762 lang=java
 *
 * [762] Prime Number of Set Bits in Binary Representation
 */

// @lc code=start
class Solution {
    public int countPrimeSetBits(int L, int R) {
        int c = 0;
        for (int i = L; i<=R; i++){
            if (checkBit(i))
                c++;
        }
        return c;
    }
    boolean checkBit(int a){
        int c = 0;
        while(a!=0){
            c+=a%2;
            a/=2;
        }
        return prime(c);
    }
    boolean prime(int a){
        if (a==1)
            return false;
        if (a== 2)
            return true;
        for (int i = 2; i<=Math.sqrt(a); i++){
            if (a%i == 0)
                return false;
        }
        return true;
    }
}
// @lc code=end

