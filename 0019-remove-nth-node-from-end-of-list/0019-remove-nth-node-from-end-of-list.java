/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }+
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }
        //trverse through linkedlistt
        ListNode current = head;
        int count = 0;
        while(current!=null){
            count++;
            current = current.next;
        }
        int pos = count - n;
        if (pos == 0) {
            return head.next; // Return the second node as the new head
        }
        ListNode prev = head;
        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }

        // Remove the Nth node from the end by skipping it
        prev.next = prev.next.next;

        return head;
    }
    
}