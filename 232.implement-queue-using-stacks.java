/*
 * @lc app=leetcode id=232 lang=java
 *
 * [232] Implement Queue using Stacks
 */

// @lc code=start
import java.util.*;
class MyQueue {
    List<Integer> q;
    /** Initialize your data structure here. */
    public MyQueue() {
        q = new LinkedList<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        q.add(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return q.remove(0);
    }
    
    /** Get the front element. */
    public int peek() {
        return q.get(0);
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return q.size()==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

