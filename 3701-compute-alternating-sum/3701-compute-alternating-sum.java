class Solution {
    public int alternatingSum(int[] arr) {
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i%2==0) sum+=arr[i];
            else if(i%2!=0) sum-=arr[i];
        }
        return sum;
    }
}