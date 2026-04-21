class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer>st=new Stack<>();
        while(l1!=null){
            st.push(l1.val);
            l1=l1.next;
        }
        Stack<Integer>gt=new Stack<>();
        while(l2!=null){
            gt.push(l2.val);
            l2=l2.next;
        }
        int carry=0;
        ListNode head=null;
        while(!st.isEmpty() || !gt.isEmpty() || carry!=0){
            int n1=st.isEmpty()?0:st.pop();
            int n2=gt.isEmpty()?0:gt.pop();
            int temp=n1+n2+carry;
            ListNode node=new ListNode(temp%10);
            node.next=head;
            head=node;
            carry=temp/10;
        }
        return head;
    }
}