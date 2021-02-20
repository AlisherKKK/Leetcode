/*
 * @lc app=leetcode id=225 lang=java
 *
 * [225] Implement Stack using Queues
 */

// @lc code=start
import java.util.*;
class MyStack {
    List<Integer> s;
    /** Initialize your data structure here. */
    public MyStack() {
        s = new ArrayList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        s.add(x);        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return s.remove(s.size()-1);
    }
    
    /** Get the top element. */
    public int top() {
        return s.get(s.size()-1);
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return s.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

