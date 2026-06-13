class MedianFinder {
    PriorityQueue<Integer>min=new PriorityQueue<>(); //minheap
    PriorityQueue<Integer>max=new PriorityQueue<>(Collections.reverseOrder()); //maxheap
    public MedianFinder() {}
    
    public void addNum(int num) {
        if(max.size()==0) max.add(num);
        else{
            if(num<max.peek()) max.add(num);
            else min.add(num);
        }
        if(max.size()==min.size()+2) min.add(max.remove());
        if(min.size()==max.size()+2) max.add(min.remove());
    }
    
    public double findMedian() {
        if(min.size()==max.size()+1) return min.peek();
        else if(max.size()==min.size()+1) return max.peek();
        else return (min.peek()+max.peek())/2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */