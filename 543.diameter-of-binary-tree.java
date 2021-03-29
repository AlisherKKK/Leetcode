/*
 * @lc app=leetcode id=543 lang=java
 *
 * [543] Diameter of Binary Tree
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
    int r ;
    public int diameterOfBinaryTree(TreeNode root) {
        r = 0;
        finder(root);
        return r;
    }
    int finder(TreeNode t){
        if (t==null)
            return 0;
        int l = finder(t.left), rr = finder(t.right);
        r = Math.max(r, l+rr);
        return Math.max(rr,l) +1;
    }
}
// @lc code=end

