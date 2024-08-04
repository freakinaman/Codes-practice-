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
    public ListNode middleNode(ListNode head) {
        ListNode temp= head;
        
        int size= size(head);
        int c=0;
       for(int i =0;i<size/2;i++)
        {
            temp=temp.next;
        }
        return temp;
    }
    public int size(ListNode head)
    {
        int c=0;
        while(head!=null)
        {
            head=head.next;
            c++;
        }
        
        return c;
        
    }
}

  