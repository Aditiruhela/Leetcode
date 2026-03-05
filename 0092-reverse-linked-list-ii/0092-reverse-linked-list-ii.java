class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev=head;
        for(int i=1;i<left;i++){
            prev=prev.next;
        }
        ListNode temp=prev;
        Stack<Integer>st=new Stack<>();
        for(int i=left;i<=right;i++){
            st.push(temp.val);
            temp=temp.next;
        }
        temp=prev;
        for(int i=left;i<=right;i++){
            temp.val=st.pop();
            temp=temp.next;
        }
        return head;
    }
}