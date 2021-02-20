/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
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
    public int minDepth(TreeNode root) {
        return find(root);
    }
    /*int find(TreeNode q, int c){
        if (q==null)
            return c;
        int l = find(q.left, 1+c);
        int r = find(q.right, 1+c);
        return Math.min(l,r);
    }*/
    int find(TreeNode q){
        if (q==null)
            return 0;
        int l = find(q.left);
        int r = find(q.right);
        if (l==0 || r==0)
            return Math.max(r,l)+1;
        return Math.min(l,r)+1;
    }
}
// @lc code=end

