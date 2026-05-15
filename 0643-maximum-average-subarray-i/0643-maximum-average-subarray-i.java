class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int n=arr.length;
        double max=Integer.MIN_VALUE;
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