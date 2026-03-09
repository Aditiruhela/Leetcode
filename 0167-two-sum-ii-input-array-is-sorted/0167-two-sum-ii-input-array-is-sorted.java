class Solution {
    public int[] twoSum(int[] arr, int t) {
        int n=arr.length;
        int i=0,j=n-1;
        int []ans=new int[2];
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==t){
                ans[0]=i+1;
                ans[1]=j+1;
                break;
            }else if(sum<t) i++;
            else j--;
        }
        return ans;
    }
}