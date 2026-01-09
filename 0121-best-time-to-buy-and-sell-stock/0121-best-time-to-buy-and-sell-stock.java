class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int maxProfit=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int profit=arr[j]-arr[i];
                maxProfit=Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
}
}