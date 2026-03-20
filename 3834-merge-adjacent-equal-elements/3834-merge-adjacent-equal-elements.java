class Solution {
    public List<Long> mergeAdjacent(int[] arr) {
        int n=arr.length;
        Stack<Long>st=new Stack<>();
        for(int x:arr){
       long curr=(long) x;
       while(!st.isEmpty() && st.peek()==curr){
        long y=st.pop();
        curr+=y;
       }
       st.push(curr);
    }
    List<Long>list=new ArrayList<>();
       for(long x:st) list.add(x);
       return list;
    }
}