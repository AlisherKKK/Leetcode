/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
        if(s.length() != t.length()) // If the lengths of the string are not equal, then they can not be isomorphic.
        {
            return false;
        }
                
        Map <Character, Character> map = new HashMap(); // Set hashMap so we can assgin keys and values to the strings.
        
        char[] arrayS = new char[s.length()];  // Create two char arrays for the strings.
        char[] arrayT = new char[t.length()];
        
        for(int i = 0; i < s.length(); i++) // Turn the strings into char array, you can use java library for that in order to save space I assume, but this is the "hands on" approach.
        {
            arrayS[i] = s.charAt(i);
        }
        
        for(int j = 0; j < t.length(); j++)
        {
            arrayT[j] = t.charAt(j);
        }
        
        for(int k = 0; k < arrayS.length; k++) // Iterate through the length of one of the arrays, (they are the same length)!
        {
            char s1 = arrayS[k];
            char t1 = arrayT[k];
            
            if(!map.containsKey(s1) && !map.containsValue(t1)) // If the map does not have the key and value, create them.
            {
                map.put(s1, t1);
            }
            
            if((!map.containsKey(s1) && map.containsValue(t1) || !map.get(s1).equals(t1))) // If the map does not contains a key but contains the value, 
			 {                                                                            //or the value of the key does not match with the key (after some iterations) return false.
                return false;
             }   
        } 
        return true;
		
    }
    /*public boolean isIsomorphic(String s, String t) {
        if (s.length() == 1)
            return true;
        if (s.length()!=t.length())
            return false;
        int[] a = new int[s.length()];
        int[] b = new int[s.length()];
        a[0] = 1; 
        b[0] = 1;
        int n = 1, m = 1;
        for (int i = 1; i<s.length(); i++){
            boolean f1 = false, f2 = false;
            for (int j = 0; j<i; j++){
                if (s.charAt(i) == s.charAt(j)){
                    a[i] = a[j];
                    f1 = true;
                }
                if (t.charAt(i) == t.charAt(j)){
                    b[i] = b[j];
                    f2 = true;
                }
            }
            if ((!f1 && f2) || (f1 && !f2))
                return false;
            if (!f1)
                a[i] = ++n;
            if (!f2)
                b[i] = ++m;
        }
        for (int i = 0; i<a.length; i++){
            if (a[i]!=b[i])
                return false;
        }
        return true;
    }*/
}
// @lc code=end

