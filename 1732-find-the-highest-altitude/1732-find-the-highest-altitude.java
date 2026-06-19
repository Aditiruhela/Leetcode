class Solution {
    public int largestAltitude(int[]arr) {
        int n=arr.length;
        int []ans=new int[n+1];
        ans[0]=0+arr[0];
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]+arr[i];
        }
        int max=Integer.MIN_VALUE;
        for(int x:ans) max=Math.max(max,x);
        return max;
    }
}