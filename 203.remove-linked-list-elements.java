/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
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
    public ListNode removeElements(ListNode head, int val) {
        if (head==null)
            return null;
        ListNode l = head;
        if (l.next == null && l.val==val)
            return null;
        while(l.next!=null){
            if (l.next.val == val)
                l.next = l.next.next;
            else
                l = l.next;
        }
        if (head.val == val)
            return head.next;
        return head;
    }
}
// @lc code=end

