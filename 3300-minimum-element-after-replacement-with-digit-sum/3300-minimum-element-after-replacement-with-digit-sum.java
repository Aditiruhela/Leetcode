class Solution {
    public int digitSum(int n){
        int temp=n;
        int sum=0;
        while(temp!=0){
            int digit=temp%10;
            sum+=digit;
            temp/=10;
        }
        return sum;
    }
    public int minElement(int[]arr) {
        int min=Integer.MAX_VALUE;
        int n=arr.length;
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=digitSum(arr[i]);
        }
        for(int x:ans) min=Math.min(x,min);
        return min;
    }
}