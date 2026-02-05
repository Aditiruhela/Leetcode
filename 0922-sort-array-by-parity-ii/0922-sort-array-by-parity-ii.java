class Solution {
    public int[] sortArrayByParityII(int[] arr) {
        int n=arr.length;
        int even=0,odd=1;
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                ans[even]=arr[i];
                even+=2;
            }else {
                ans[odd]=arr[i];
                odd+=2;
            }
        }
        return ans;
    }
}