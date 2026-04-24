class Solution {
    public int calPoints(String[] arr) {
    Stack<Integer>st=new Stack<>();
    for(String x:arr){
        if(x.equals("+")){
            int a=st.pop();
            int b=st.peek();
            st.push(a);
            st.push(a+b);
        }else if(x.equals("C")) st.pop();
        else if(x.equals("D")) st.push(st.peek()*2);
        else{
            st.push(Integer.parseInt(x));
        }
    }
    int ans=0;
    for(int x:st) ans+=x;
    return ans; 
    }
}