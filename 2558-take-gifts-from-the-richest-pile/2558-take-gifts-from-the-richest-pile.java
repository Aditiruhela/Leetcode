class Solution {
    public long pickGifts(int[]arr, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x:arr) pq.add(x);
        for(int i=0;i<k;i++){
            int a=(int)Math.sqrt(pq.remove());
            pq.add(a);
        }
        long sum=0;
        while(pq.size()!=0) sum+=pq.remove();
        return sum;
    }
}