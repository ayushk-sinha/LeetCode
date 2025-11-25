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
    ListNode end;
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        if(end == null) end = head;
        boolean bool = isPalindrome(head.next); //send head to end
        
        if(head.val == end.val)    //compare the front and end nodes
            end = end.next;
        else
            bool = false;
        
        return bool;
    }
}