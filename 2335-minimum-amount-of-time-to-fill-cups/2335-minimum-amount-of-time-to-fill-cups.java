class Solution {
    public int fillCups(int[]arr) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:arr){
            if(x>0)pq.offer(x);
        }
        int s=0;
        while(pq.size()!=0){
            if(pq.size()>=2){
            int a=pq.poll();
            int b=pq.poll();
            a--;
            b--;
            if(a>0) pq.offer(a);
            if(b>0) pq.offer(b);
            s++;
            }else{
                int a=pq.poll();
                a--;
                if(a>0) pq.offer(a);
                s++;
            }
        }
        return s;
    }
}