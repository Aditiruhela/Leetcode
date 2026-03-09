public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        ListNode slow=temp;
        ListNode fast=temp;
        if(temp==null) return false;
        while(fast!=null && fast.next!=null){
           slow=slow.next;
           if(fast.next==null) return false;
           fast=fast.next.next;
           if(slow==fast) return true;
        }
        return false;
    }
}