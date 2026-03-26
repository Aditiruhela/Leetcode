class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets.length;
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++) q.offer(i);
        int t=0;
        while(tickets[k]!=0){
            int x=q.peek();
            q.remove(x);
            t++;
            tickets[x]--;
            if(x==k && tickets[x]==0) break;
            else if(tickets[x]==0) continue;
            else{
                q.offer(x);
            }
        }
        return t;
    }
}