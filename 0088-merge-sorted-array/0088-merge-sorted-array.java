class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int[]nums=new int[m+n];
        int k=0;
        int j=0;
        int i=0;
        for(i=0;i<m && j<n;){
                if(arr1[i]<=arr2[j]){
                    nums[k++]=arr1[i];
                    i++;
                }
            else{
            nums[k++]=arr2[j];
            j++;
                }
            }
        for(;i<m;i++){
            nums[k++]=arr1[i];
        }
        for(;j<n;j++){
            nums[k++]=arr2[j];
        }
        for(i=0;i<m+n;i++){
            arr1[i]=nums[i];
        }
    }
}