/**
 * Source: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/539/week-1-june-1st-june-7th/3348/
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        ListNode ptr = node;
        ListNode prev = node;
        
        while( ptr.next != null )
        {
            ptr.val = ptr.next.val;
            prev = ptr;
            ptr = ptr.next;
        }
        prev.next = null;
        ptr = null;
    }
}