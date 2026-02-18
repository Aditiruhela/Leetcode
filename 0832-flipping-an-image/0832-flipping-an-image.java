class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            int left=0;
            int right=arr[i].length-1;
            while(left<right){
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
                left++;
                right--;
            }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j]=1-arr[i][j];
                }
            }
            return arr;
    }
}