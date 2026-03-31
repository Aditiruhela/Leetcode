class Solution {
    public int[] decrypt(int[] arr, int k) {
        int n=arr.length;
        int[]ans=new int[n];
        if(k==0) return ans;
        for(int i=0;i<n;i++){
            if(k<0){
                for(int j=i+k;j<i;j++){
                    ans[i]+=arr[(j+n)%n];
                }
            }else if(k>0){
                for(int j=i+1;j<=i+k;j++){
                    ans[i]+=arr[j%n];
                }
            }
        }
        return ans;
    }
}