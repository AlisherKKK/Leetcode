/*
 * @lc app=leetcode id=572 lang=java
 *
 * [572] Subtree of Another Tree
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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return find(s,t);
    }
    boolean equal(TreeNode s, TreeNode t){
        if (s == null && t == null)
            return true;
        else if (s==null || t == null)
            return false;
        return s.val == t.val && equal(s.left, t.left) && equal(s.right, t.right);
    }
    boolean find(TreeNode s, TreeNode t){
        return s!=null && (equal(s,t) || find(s.left, t) || find(s.right, t));
    }
}
// @lc code=end

