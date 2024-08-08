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
    public ListNode rotateRight(ListNode head, int k) {
    
        
        ListNode dummy=head;
        
    if (head == null || head.next == null) return head;
        int count=0;
        while(dummy!=null)
        {
            dummy=dummy.next;
            count++;
        }
        if(k>count)
            k=k%count;
    for (int i = 0; i < k; i++) {
      ListNode temp = head;
      while (temp.next.next != null) temp = temp.next;
      ListNode end = temp.next;
      temp.next = null;
      end.next = head;
      head = end;
    }
        return head;
        
    }
}

