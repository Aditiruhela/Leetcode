class Solution {
    public boolean isToeplitzMatrix(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        boolean flag=true;
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][j]!=arr[i-1][j-1]){
                    flag=false;
                    break;
            }
        }
        }
        if(flag) return true;
        else return false;
    }
}