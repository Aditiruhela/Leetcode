class Solution {
    public int[] twoSum(int[]arr, int target) {
        int n=arr.length;
        int []ans=new int[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum=arr[i]+arr[j];
                if(sum==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        return ans;
    }
}