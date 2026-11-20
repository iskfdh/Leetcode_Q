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
        ListNode end=null;
        ListNode a=head;
        while(a!=null){
            ListNode b=a.next;
       a.next=end;
       end=a;
       a=b;
        }
return end;
    }
}