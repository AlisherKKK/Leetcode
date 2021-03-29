import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=700 lang=java
 *
 * [700] Search in a Binary Search Tree
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
    int res = 0;
    public TreeNode searchBST(TreeNode t, int v) {
        if (t == null)
            return null;
        if (t.val == v)
            return t;
        if (t.val>v)
            return searchBST(t.left,v);
        else
            return searchBST(t.right, v);
    }
    
}
// @lc code=end

