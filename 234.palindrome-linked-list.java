/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode ln = null;
    public boolean isPalindrome(ListNode head) {
        String r1 = "";
        String r2 = "";
        ListNode c = null;
        if (head==null)
            return true;
        do{
            c = c==null ? head : c.next;
            r1+=c.val;
            r2=c.val+r2;
        }
        while(c.next!=null);
        return r1.equals(r2);
    }
}
// @lc code=end

