import java.util.HashMap;

/*
 * @lc app=leetcode id=690 lang=java
 *
 * [690] Employee Importance
 */

// @lc code=start
/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    HashMap<Integer, Employee> hm; 
    public int getImportance(List<Employee> employees, int id) {
        hm = new HashMap<>();
        for (Employee e : employees)
            hm.put(e.id, e);
        return find(id);
    }
    int find(int id){
        Employee e = hm.get(id);
        int a = e.importance;
        for (int i : e.subordinates)
            a+=find(i);
        return a;
    }
}
// @lc code=end

