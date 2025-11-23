class Solution {
    public int[] sortedSquares(int[] arr) {

                int n=arr.length;
        int i=0,j=n-1;
        int []ans=new int[n];
        int k=0;
        while(i<=j){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
               ans[k++]= arr[i]*arr[i];
               i++;
            }else{
                ans[k++]= arr[j]*arr[j];
               j--;
            }
        }
        reverse(ans);
        return ans;
    }
    static void reverse(int[]arr){
        int i=0,j=arr.length-1;
        while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        }
    }
}