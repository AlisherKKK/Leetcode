import java.util.ArrayList;

/*
 * @lc app=leetcode id=107 lang=java
 *
 * [107] Binary Tree Level Order Traversal II
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
import java.util.*;
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<TreeNode> q = new ArrayList<>();
        TreeNode c = null;
        if (root==null)
            return res;
        q.add(root);    
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> r = new ArrayList<>();
            while(s-->0){
                c = q.remove(0);
                r.add(c.val);
                if (c.left!=null) q.add(c.left);
                if (c.right!=null) q.add(c.right); 
            }
            res.add(0, r);
        }
        return res;
    }
}
// @lc code=end

