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
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode prev = null;
        ListNode current = head;
        //
        while (current != null) {
            // Before changing current ptr next node, keep reference copy
            ListNode next = current.next;
            // Change the current node next ptr to prev node
            current.next = prev;
            // For the next iteration, keep current as previous node
            prev = current;
            current = next;
        }
        // Return last node as a Head reference
        return prev;
    }
}
    
        
      