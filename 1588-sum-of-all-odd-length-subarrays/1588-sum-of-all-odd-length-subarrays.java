class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int sum=0;
        int []prefix=new int[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+arr[i];
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if((j-i+1)%2!=0){
                sum+=prefix[j+1]-prefix[i];
            }
        }
        }
    return sum;
}
}