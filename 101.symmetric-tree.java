/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
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
    public boolean isSymmetric(TreeNode root) {
        if (root==null)
            return true;
        return check(root.left, root.right);
    }
    boolean check(TreeNode q, TreeNode w){
        if ((w==null && q!=null) || (q==null && w!=null))
            return false;
        if (q==null && w==null)
            return true;
        return q.val==w.val && check(q.left, w.right) && check(q.right, w.left);
    }
}
// @lc code=end

