import java.awt.List;
import java.util.ArrayList;

/*
 * @lc app=leetcode id=706 lang=java
 *
 * [706] Design HashMap
 */

// @lc code=start
class MyHashMap {
    List<int[]> l;
    /** Initialize your data structure here. */
    public MyHashMap() {
        l = new ArrayList<>();
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        if (get(key) == -1)
            l.add(new int[]{key, value});
        else{
            for (int[] i : l){
                if (i[0] == key)
                    i[1] = value;
            }
        }
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        for (int[] i : l){
            if (i[0] == key)
                return i[1];
        }
        return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        for (int i = 0; i< l.size(); i++){
            if (l.get(i)[0] == key)
                l.remove(i);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
// @lc code=end

