class Solution {
    public int calPoints(String[] op) {
        Stack<Integer>st=new Stack<>();
        for(String x:op){
            if(x.equals("+")){
                int a=st.pop();
                int b=st.peek();
                st.push(a);
                st.push(a+b);
            }else if(x.equals("D")){
                st.push(st.peek()*2);
            }else if(x.equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(x));
            }
        }
        int sum=0;
        for(int x:st) sum+=x;
        return sum;
    }
}