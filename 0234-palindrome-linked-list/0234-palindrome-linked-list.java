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
    public boolean isPalindrome(ListNode head) {
        // ArrayList<Integer>list=new ArrayList<>();
        // ListNode temp=head;
        // while(temp!=null){
        //     list.add(temp.val);
        //     temp=temp.next;
        // }
        // int i=0;
        // int j=list.size()-1;
        // while(i<j){
        //     if(list.get(i)!=list.get(j)) return false;
        //         i++;
        //         j--;
        // }
        // return true;
        Stack <Integer>st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(st.pop()!=temp.val) return false;
            else temp=temp.next;
        }
        return true;
    }
}