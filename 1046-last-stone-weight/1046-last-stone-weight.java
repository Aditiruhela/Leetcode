class Solution {
    public int lastStoneWeight(int[]arr) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:arr) pq.add(x);
        while(pq.size()>1){
            int a=pq.remove();
            int b=pq.remove();
            if(a==b) continue;
            else{
                pq.add(a-b);
            }
        }
        return pq.isEmpty()?0:pq.remove();
    }
}