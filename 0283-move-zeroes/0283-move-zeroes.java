class Solution {
    public void moveZeroes(int[] arr) {
        int k=0;
        int n=arr.length;
     //TC:n,S.C=n
        // int []nums=new int[n];
        // for(int i=0;i<n;i++){
        //     if(arr[i]!=0){
        //         nums[k++]=arr[i];
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     arr[i]=nums[i];
        // }
         //TC:n,S.C=1
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[k];
                arr[k]=arr[i];
                arr[i]=temp;
                k++;
            }
        }
    }
}