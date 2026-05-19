class Solution {
    public int getCommon(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i]<arr2[j]) break; 
                if(arr1[i]==arr2[j]) return arr1[i];
            }
        }
        return -1;
    }
}