class MyQueue {
    Stack<Integer>st;
    Stack<Integer>gt;
    public MyQueue() {
        st=new Stack<>();
        gt=new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        while(st.size()>1) gt.push(st.pop());
        int val=st.pop();
        while(gt.size()!=0) st.push(gt.pop());
        return val;
    }
    
    public int peek() {
        while(st.size()!=0) gt.push(st.pop());
        int val=gt.pop();
        gt.push(val);
        while(gt.size()!=0) st.push(gt.pop());
        return val;
    }
    
    public boolean empty() {
        if(st.size()==0) return true;
        else return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */