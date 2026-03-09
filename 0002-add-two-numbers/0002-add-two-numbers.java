class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode l3=new ListNode(0);
        ListNode tempji=l3;
        int carry=0;
        while(temp1!=null || temp2!=null){
            int x=(temp1!=null)?temp1.val:0;
            int y=(temp2!=null)?temp2.val:0;
            int sum=x+y+carry;
            tempji.next=new ListNode(sum%10);
            carry=sum/10;
            tempji=tempji.next;
            if(temp1!=null) temp1=temp1.next;
            if(temp2!=null) temp2=temp2.next;
        }
        if(carry!=0) tempji.next=new ListNode(carry);
        return l3.next;
    }
}