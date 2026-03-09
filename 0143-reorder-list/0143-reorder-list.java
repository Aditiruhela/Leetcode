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
    public void reorderList(ListNode head) {
        ListNode temp=head;
        Stack<ListNode>st=new Stack<>();
        while(temp!=null){
            st.push(temp);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null && temp.next!=null){
            ListNode last=st.pop();
            if(temp==last || temp.next==last){
                last.next=null;
                break;
            }
            ListNode front=temp.next;
            temp.next=last;
            last.next=front;
            temp=front;
        }
    }
}