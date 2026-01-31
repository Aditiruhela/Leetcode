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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(temp!=null){
            if(map.containsKey(temp.val)){
                map.put(temp.val,map.get(temp.val)+1);
            }
           else map.put(temp.val,1);
           temp=temp.next;
        }
        temp=head;
        LinkedHashSet<ListNode>set=new LinkedHashSet<>();
        while(temp!=null){
            if(map.get(temp.val)==1)
            set.add(temp);
            temp=temp.next;
        }
    
        ListNode dum=new ListNode(0);
        ListNode curr=dum;
        for(ListNode node:set){
            node.next=null;
            curr.next = node;
            curr = curr.next;
            }
            return dum.next;
        }
}