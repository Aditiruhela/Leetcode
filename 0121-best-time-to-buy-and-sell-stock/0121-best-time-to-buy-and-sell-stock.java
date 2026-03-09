class Solution {
    public int maxProfit(int[] arr) {
        // int min=Integer.MAX_VALUE;
        int n=arr.length;
        // int[]ans=new int[n];
        // for(int i=0;i<n;i++){
        //     min=Math.min(arr[i],min);
        //     ans[i]=min;

        // }
        // int x=0;
        int max=Integer.MIN_VALUE;
        // int []arr1=new int[n];
        // for(int i=0;i<n;i++){
        //     arr1[i]=arr[i]-ans[i];
        //     max=Math.max(arr1[i],max);
        //     x=max;
        // }
        // return x;
        int maxProfit=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int profit=arr[j]-arr[i];
                maxProfit=Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
    }
}