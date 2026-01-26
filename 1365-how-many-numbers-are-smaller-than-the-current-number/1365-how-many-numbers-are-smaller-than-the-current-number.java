class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
        int n=arr.length;
        int[]ans=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<n;j++){
            if(i!=j && arr[i]>arr[j]) count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}