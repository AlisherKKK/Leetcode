import java.util.ArrayList;

/*
 * @lc app=leetcode id=590 lang=java
 *
 * [590] N-ary Tree Postorder Traversal
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
    List<Integer> l = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        find(root);
        return l;
    }
    void find(Node root){
        if (root == null)
            return ;
        for (Node n : root.children)
            find(n);
        l.add(root.val);
    }
}
// @lc code=end

