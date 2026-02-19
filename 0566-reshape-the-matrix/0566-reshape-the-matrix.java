class Solution {
    public int[][] matrixReshape(int[][] arr, int r, int c) {
        int n=arr.length;
        int m=arr[0].length;
        int [][]ans=new int[r][c];
        if(arr.length*arr[0].length!=r*c) return arr;
        int k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=arr[k/m][k%m];
                k++;
            }
        }
        return ans;
    }
}