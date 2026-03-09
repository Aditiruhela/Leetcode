public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        ListNode slow=temp;
        ListNode fast=temp;
        while(temp!=null || temp.next!=null){
           slow=slow.next;
           if(fast.next==null) return false;
           fast=fast.next.next;
           if(slow==fast) return true;
        }
        return false;
    }
}