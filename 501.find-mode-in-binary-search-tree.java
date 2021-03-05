import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=501 lang=java
 *
 * [501] Find Mode in Binary Search Tree
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
    public List<Integer> l = new ArrayList<>();
    public int m = 0;
    public int c = 0;
    public int prev = Integer.MIN_VALUE;
    public int[] findMode(TreeNode root) {
        find(root);
        int[] r = new int[l.size()];
        int ind = 0;
        for (int i : l)
            r[ind++] = i;
        return r;
    }
    public void find(TreeNode root){
        if (root!=null){
            find(root.left);
            if (root.val == prev)
                c++;
            else{
                c = 1;
                prev = root.val;
            }
            if (c>m){
                m = c;
                l = new ArrayList<>();
                l.add(root.val);
            }
            else if (c==m)
                l.add(root.val);
            find(root.right);
        }
    }
}
// @lc code=end

