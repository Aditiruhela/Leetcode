class Solution {
    public void moveZeroes(int[] arr) {
        int n=arr.length;
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
                index++;
            }
        }
    }
}