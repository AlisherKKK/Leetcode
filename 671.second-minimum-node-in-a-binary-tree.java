import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=671 lang=java
 *
 * [671] Second Minimum Node In a Binary Tree
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
    List<Integer> l = new ArrayList<>();
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null)
            return -1;
        traverse(root);
        int m = l.get(0);
        for (int i : l)
            m = Math.min(i,m);
        int m2 = l.get(0);
        for (int i : l)
            m2 = Math.max(i,m2);
        for (int i : l){
            if (i!=m && i<=m2)
                m2 = i;
        }
        if (m == m2)
            return -1;
        return m2;
    }
    void traverse(TreeNode r){
        if (r == null)
            return ;
        l.add(r.val);
        traverse(r.left);
        traverse(r.right);
    }
}
// @lc code=end

