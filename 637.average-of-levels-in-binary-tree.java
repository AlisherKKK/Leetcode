import java.util.ArrayList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=637 lang=java
 *
 * [637] Average of Levels in Binary Tree
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
    List<Double> l = new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int c = q.size();
            Double s = 0.0;
            for (int i = 0; i<c;i++){
                TreeNode tr = q.poll();
                s+=tr.val;
                if (tr.left != null)
                    q.add(tr.left);
                if (tr.right != null)
                    q.add(tr.right); 
            }
            l.add(s/c);
        }
        return l;
    }
}
// @lc code=end

