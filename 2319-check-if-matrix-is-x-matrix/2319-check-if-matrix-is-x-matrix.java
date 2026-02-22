class Solution {
    public boolean checkXMatrix(int[][]arr){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j || i+j==n-1){
                    if(arr[i][j]==0)return false;
                }else{
                    if(arr[i][j]!=0) return false;
                }
            }
        }
        return true;
    }
}