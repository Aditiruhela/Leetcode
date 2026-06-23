class Solution {
    public int findKthLargest(int[]arr, int k) {
        int n=arr.length;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:arr){
            pq.add(x);
        }
        for(int i=1;i<k;i++){
            pq.poll();
        }
        return pq.peek();
    }
}