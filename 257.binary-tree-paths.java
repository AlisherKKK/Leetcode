/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
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
    List<String> paths = new ArrayList<>();  
    public List<String> binaryTreePaths(TreeNode root) {
        if (root==null)
            return paths;
        rec(root, "");
        return paths;
    }
    void rec(TreeNode t, String l){
        if (t == null)
            return;
        l+=t.val;
        if (t.left == null && t.right == null)
            paths.add(l);
        else{
            l+="->";
            rec(t.left,l);
            rec(t.right,l);
        }
    }
}
// @lc code=end

