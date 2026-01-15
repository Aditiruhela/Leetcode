class Solution {
    public int countPairs(int[]arr, int k) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j] && (i*j )%k==0) count++;
        }
       }
        return count;
    }
}