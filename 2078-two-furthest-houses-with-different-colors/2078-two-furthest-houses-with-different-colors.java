class Solution {
    public int maxDistance(int[] arr) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]!=arr[j]){
                    max=Math.max(max,Math.abs(i-j));
                }
            }
        }
        return max;
        // int i=0,j=n-1;
        // int ans=-1;
        // while(i<j){
        //     if(arr[i]!=arr[j]){
        //         ans=Math.abs(i-j);
        //         return ans;
        //     }else{
        //         i++;
        //         j--;
        //     }
        // }
        // return ans;
    }
}