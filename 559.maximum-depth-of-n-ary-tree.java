/*
 * @lc app=leetcode id=559 lang=java
 *
 * [559] Maximum Depth of N-ary Tree
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    int r ;
    public int maxDepth(Node root) {
        return dfs(root);
    }
    public int dfs(Node root){
        if(root == null) return 0;
        
        if(root.children.size() == 0) return 1;
        
        int maxHeight = Integer.MIN_VALUE;
        for(int i = 0; i < root.children.size(); i++)
            maxHeight = Math.max(maxHeight, 1 + dfs(root.children.get(i)));
        
        return maxHeight;        
    }
}
// @lc code=end

