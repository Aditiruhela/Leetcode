class Solution {
    public int[] finalPrices(int[] arr) {
        int n=arr.length;
        int []ans=new int [n];
        for(int i=0;i<n;i++){
            ans[i]=arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[j]<=arr[i]){
                    ans[i]=arr[i]-arr[j];
                    break;
                }
            }
        }
        return ans;
    }
}