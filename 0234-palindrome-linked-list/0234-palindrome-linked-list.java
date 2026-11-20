class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast!=null)
        slow=slow.next;
        ListNode end=null;
        ListNode a=slow;
        while(a!=null){
            ListNode b=a.next;
       a.next=end;
       end=a;
       a=b;
        }
        fast=head;
       while(end!=null){
        if(end.val!=fast.val)
        return false;
            end=end.next;
            fast=fast.next;
       }
       return true;
    }
}