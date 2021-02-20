import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
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
    boolean res = true;
    public boolean isBalanced(TreeNode root) {
        find(root);
        return res;
    }
    int find(TreeNode q){
        if (q==null)
            return 0;
        int l = find(q.left);
        int r = find(q.right);
        if (Math.abs(l-r)>1)
            res = false;
        return 1+Math.max(l,r);
    }
}
// @lc code=end

