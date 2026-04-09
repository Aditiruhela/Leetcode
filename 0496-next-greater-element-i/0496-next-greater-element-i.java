class Solution {
    public int[] nextGreaterElement(int[]arr1, int[]arr2) {
        Stack<Integer>st=new Stack<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr2){
            while(!st.isEmpty() && x>st.peek()) map.put(st.pop(),x);
            st.push(x);
        }
        while(st.size()!=0){
            map.put(st.pop(),-1);
        }
        int []ans=new int[arr1.length];
        int i=0;
        for(int x:arr1){
            ans[i]=map.get(x);
            i++;
        }
        return ans;
    }
}