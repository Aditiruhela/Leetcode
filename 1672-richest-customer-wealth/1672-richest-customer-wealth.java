class Solution {
    public int maximumWealth(int[][] arr) {
        int r=arr.length;
        int c=arr[0].length;
        int max=0;
        int sum=0;
        for(int i=0;i<r;i++){
            sum=0;
            for(int j=0;j<c;j++){
                sum+=arr[i][j];
                max=Math.max(sum,max);
            }
        }
        return max;
    }
}