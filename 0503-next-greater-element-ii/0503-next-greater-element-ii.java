class Solution {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer>st=new Stack<>();
        int n=arr.length;
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=-1;
            for(int j=i+1;j<=i+n-1;j++){
               int index=j%n;
                if(arr[index]>arr[i]){
                    ans[i]=arr[index];
                    break;
                }
            }
        }
        return ans;
    }
}