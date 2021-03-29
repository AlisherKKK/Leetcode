import java.util.ArrayList;

/*
 * @lc app=leetcode id=653 lang=java
 *
 * [653] Two Sum IV - Input is a BST
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> l = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        tr(root);
        for (int i = 0; i<l.size()-1; i++){
            for (int j = i+1; j<l.size(); j++){
                if (l.get(i)+l.get(j) == k)
                    return true;
            }
        }
        return false;
    }
    void tr(TreeNode t){
        if (t==null)
            return ;
        l.add(t.val);
        tr(t.left);
        tr(t.right);
    }   
}
// @lc code=end

