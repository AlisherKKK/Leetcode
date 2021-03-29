import java.util.ArrayList;

/*
 * @lc app=leetcode id=783 lang=java
 *
 * [783] Minimum Distance Between BST Nodes
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
    public int minDiffInBST(TreeNode root) {
        if (root == null)
            return 0;
        tr(root);
        int m = Integer.MAX_VALUE;
        for (int i = 0; i < l.size()-1; i++){
            for (int j = i+1; j < l.size(); j++){
                int c = Math.abs(l.get(i)-l.get(j));
                if (c!=0)
                    m = Math.min(c,m);
            }
        }
        return m;
    }
    void tr(TreeNode t){
        if (t==null)
            return;
        l.add(t.val);
        tr(t.left);
        tr(t.right);
    }
}
// @lc code=end

