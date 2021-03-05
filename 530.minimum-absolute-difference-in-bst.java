/*
 * @lc app=leetcode id=530 lang=java
 *
 * [530] Minimum Absolute Difference in BST
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
    int p=-1, c=-1, a = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        find(root);
        return a;    
    }
    void find(TreeNode t){
        if (t==null)
            return ;
        find(t.left);
        p = c;
        c = t.val;
        if(p!=-1)
            a = Math.min(a, c-p);
        find(t.right);
    }
}
// @lc code=end

