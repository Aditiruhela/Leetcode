class Solution {
    public int maxDistance(int[] arr) {
        //brute
        int n=arr.length;
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i]!=arr[j]){
        //             max=Math.max(max,Math.abs(i-j));
        //         }
        //     }
        // }
        // return max;
        int i=0,j=n-1;
        int ans=-1;
        while(j>0){
            if(arr[i]!=arr[j]){
                ans=Math.abs(i-j);
               break;
            }else j--;
        }
        while(i<n){
            if(arr[i]!=arr[j]){
                ans=Math.abs(i-j);
                break;
            }else i++;
        }
        return ans;
    }
}