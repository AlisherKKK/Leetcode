import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=811 lang=java
 *
 * [811] Subdomain Visit Count
 */

// @lc code=start
class Solution {
    List<String> l = new ArrayList<>();
    Map<String, Integer> map = new HashMap<>();
    public List<String> subdomainVisits(String[] cpdomains) {
        for (String el : cpdomains){
            String[] dom = el.split(" ");
            String[] link = dom[1].split("\\.");
            String newCP = "";
            for (int i = link.length-1; i>=0; i--){
                newCP = link[i] + (i<link.length - 1 ? "." : "") + newCP;
                if (map.get(newCP) != null)
                    map.put(newCP,map.get(newCP) + Integer.parseInt(dom[0]));
                else
                    map.put(newCP, Integer.parseInt(dom[0]));
            }
        }
        for (String i : map.keySet())
            l.add(map.get(i) + " " + i);
        return l;

    }
}
// @lc code=end

