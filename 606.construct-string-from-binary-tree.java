/*
 * @lc app=leetcode id=606 lang=java
 *
 * [606] Construct String from Binary Tree
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
    String r = "";
    public String tree2str(TreeNode t) {
        r=f(t);
        return r;
    }
    String f(TreeNode t){
        if (t==null)
            return "";
        if (t.left == null && t.right == null)
            return t.val+"";
        if (t.right == null)
            return t.val+"("+f(t.left)+")";
        return t.val+"("+f(t.left)+")("+f(t.right)+")";
    }
}
// @lc code=end

