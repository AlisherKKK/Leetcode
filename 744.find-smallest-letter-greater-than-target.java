/*
 * @lc app=leetcode id=744 lang=java
 *
 * [744] Find Smallest Letter Greater Than Target
 */

// @lc code=start
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for (char i : letters)
            if (i>target)
                return i;
        return letters[0];
    }
}
// @lc code=end

