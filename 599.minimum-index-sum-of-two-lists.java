/*
 * @lc app=leetcode id=599 lang=java
 *
 * [599] Minimum Index Sum of Two Lists
 */

// @lc code=start
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min = list1.length + list2.length;
        String r = "";
        for (int i = 0; i<list2.length; i++){
            for (int j = 0; j<list1.length; j++){
                if (list2[i].equals(list1[j])){
                    min = Math.min(min, i+j);
                    continue;
                }
            }
        }
        for (int i = 0; i<list2.length; i++){
            for (int j = 0; j<list1.length; j++){
                if (list2[i].equals(list1[j]) && (i+j)==min){
                    r+=list2[i]+"  ";
                    continue;
                }
            }
        }
        return r.split("  ");
    }
}
// @lc code=end

