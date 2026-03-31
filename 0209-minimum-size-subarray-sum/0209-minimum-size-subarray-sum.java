class Solution {
    public int minSubArrayLen(int t, int[] arr) {
        int l=0,r=0,sum=0,minLen=Integer.MAX_VALUE;
        int n=arr.length;
        while(r<n){
            sum+=arr[r];
            while(sum>=t){
                minLen=Math.min(minLen,r-l+1);
                sum-=arr[l];
                l++;
            }
           r++;
        }
        return minLen==Integer.MAX_VALUE?0:minLen;
    }
}