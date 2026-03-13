class Solution {
    public int maxSubArray(int[] arr) {
        int max=Integer.MIN_VALUE;
       int sum=0;
       int i=0;
       while(i<arr.length){
        sum+=arr[i];
        max=Math.max(max,sum);
        if(sum<0){
            sum=0;
            }
                i++;
       }
       return max;
    }
}