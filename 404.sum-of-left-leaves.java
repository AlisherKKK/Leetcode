/*
 * @lc app=leetcode id=404 lang=java
 *
 * [404] Sum of Left Leaves
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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if (root!=null){
            if (root.left!=null){
                if (root.left.left == null && root.left.right == null)
                    sum+=root.left.val;
                sum+=sumOfLeftLeaves(root.left);
            }
            if (root.right!=null){
                sum+=sumOfLeftLeaves(root.right);
            }
        }
        return sum;
    }
}
// @lc code=end

