/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++){
            if (magazine.contains(ransomNote.charAt(i)+"")){
                int ind = magazine.indexOf(ransomNote.charAt(i));
                magazine = magazine.substring(0, ind)+magazine.substring(ind+1);
                continue;
            }
            return false;
        }
        return true;
    }
}
// @lc code=end

