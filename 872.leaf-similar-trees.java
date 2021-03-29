import java.awt.List;
import java.util.ArrayList;

/*
 * @lc app=leetcode id=872 lang=java
 *
 * [872] Leaf-Similar Trees
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        tr1(root1, l2);
        tr1(root2, l3);
        return l2.equals(l3);
    }
    void tr1(TreeNode t, ArrayList<Integer> l3){
        if (t != null ){
            if (t.left == null && t.right == null)
                l3.add(t.val);
            tr1(t.left,l3);
            tr1(t.right,l3);
        }
    }
}
// @lc code=end

