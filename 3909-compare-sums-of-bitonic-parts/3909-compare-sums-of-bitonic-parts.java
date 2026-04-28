class Solution {
    public int compareBitonicSums(int[] arr) {
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++){
           if(arr[i]>arr[max]){
               max=i;
           }
        }
        long sum1=0;
        long sum2=0;
        for(int i=0;i<=max;i++){
            sum1+=arr[i];
        }
        for(int i=max;i<n;i++){
            sum2+=arr[i];
        }
        if(sum1>sum2) return 0;
        else if(sum1<sum2) return 1;
        else return -1;
    }
}