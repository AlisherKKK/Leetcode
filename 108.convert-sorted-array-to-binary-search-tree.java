/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length==0)
            return null;
        return find(0, nums.length-1, nums);
    }
    TreeNode find(int l, int r, int[] n){
        if (l>r)
            return null;
        int m = (r+l)/2;
        TreeNode t = new TreeNode(n[m]);
        t.left = find(l,m-1,n);   
        t.right = find(m+1,r,n);   
        return t;
    }
}
// @lc code=end

