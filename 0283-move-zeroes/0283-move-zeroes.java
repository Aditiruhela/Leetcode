class Solution {
    public void moveZeroes(int[] arr) {
        int k=0;
        int n=arr.length;
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