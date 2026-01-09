class Solution {
    public int diagonalSum(int[][] arr) {
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    sum+=arr[i][j];
                }else if(i+j==n-1){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }
}