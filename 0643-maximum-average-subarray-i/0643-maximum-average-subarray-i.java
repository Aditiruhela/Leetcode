class Solution {
    public double findMaxAverage(int[]arr, int k) {
        double max=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<=n-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            double avg=(double)sum/k;
            max=Math.max(max,avg);
        }
        return max;
    }
}