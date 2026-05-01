class Solution {
    public int[] shuffle(int[] arr, int n) {
        int []ans=new int[2*n];
        int mid=n;
        Stack<Integer>st=new Stack<>();
        for(int i=2*n-1;i>=mid;i--){
            st.push(arr[i]);
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<mid;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<2*n;i+=2){
            ans[i]=list.get(i/2);
        }
        for(int i=1;i<2*n;i+=2){
            int x=st.pop();
            ans[i]=x;
        }
        return ans;
    }
}