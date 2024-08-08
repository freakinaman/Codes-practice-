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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null){
            return head;
        }
        ListNode curr = head;
        ListNode dummy = null;
        ListNode prev = null;
        int count = 0;
        while(curr != null && count < k){
            curr = curr.next;
            count++;
        }
        curr = head;
        if(count == k) {
            count = 0;
            while(curr != null && count < k){
                dummy = curr.next;
                curr.next = prev;
                prev = curr;
                curr = dummy;
                count++;
            }
        }else {
            prev = head;
        }
        if(dummy != null){
            head.next = reverseKGroup(dummy, k);
        }
        return prev;
    }
}