import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=705 lang=java
 *
 * [705] Design HashSet
 */

// @lc code=start
class MyHashSet {
    List<Integer> l;
    /** Initialize your data structure here. */
    public MyHashSet() {
        l = new ArrayList<>();
    }
    
    public void add(int key) {
        l.add(key);
    }
    
    public void remove(int key) {
        for (int i = 0; i<l.size(); i++){
            if (l.get(i) == key)
                l.remove(i--);
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return l.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
// @lc code=end

