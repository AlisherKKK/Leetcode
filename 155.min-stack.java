/*
 * @lc app=leetcode id=155 lang=java
 *
 * [155] Min Stack
 */

// @lc code=start
import java.util.*;
class MinStack {
    List<Integer> a;
    /** initialize your data structure here. */
    public MinStack() {
        a = new ArrayList<>();
    }
    
    public void push(int x) {
        a.add(0, x);
    }
    
    public void pop() {
        a.remove(0);
    }
    
    public int top() {
        return a.get(0);
    }
    
    public int getMin() {
        int m = top();
        for (int i : a)
            m = Math.min(m, i);
        return m;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end

