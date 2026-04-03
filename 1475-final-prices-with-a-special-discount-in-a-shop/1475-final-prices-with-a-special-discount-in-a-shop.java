class Solution {
    public int []nse(int []arr){
        Stack<Integer>st=new Stack<>();
        int n=arr.length;
        int[]nse=new int[n];
        for(int i=n-1;i>=0;i--){
            while(st.size()!=0 && st.peek()>arr[i]){
                st.pop();
            }
            nse[i]=st.isEmpty()?-1:st.peek();
            st.push(arr[i]);
        }
        return nse;
    }
    public int[] finalPrices(int[] arr) {
        // int n=arr.length;
        // int []ans=new int [n];
        // for(int i=0;i<n;i++){
        //     ans[i]=arr[i];
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]<=arr[i]){
        //             ans[i]=arr[i]-arr[j];
        //             break;
        //         }
        //     }
        // }
        // return ans;
        int n=arr.length;
        int[] nse=nse(arr);
        int []p=new int[n];
        for(int i=0;i<n;i++){
            if(nse[i]!=-1){
                p[i]=arr[i]-nse[i];
            }else{
                p[i]=arr[i];
            }
        }
    return p;
    }
}