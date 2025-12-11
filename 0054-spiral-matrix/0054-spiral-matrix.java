class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        List<Integer> list=new ArrayList<>();
        int totalEle=0;
        int topRow=0,rightCol=n-1,bottomRow=m-1,leftCol=0;
        while(totalEle<m*n){
            //topRow
            for(int j=leftCol;j<=rightCol && totalEle<m*n;j++){
                list.add(arr[topRow][j]);
                totalEle++;
            }
            topRow++;
            //rightCol
            for(int i=topRow;i<=bottomRow && totalEle<m*n;i++){
                list.add(arr[i][rightCol]);
                totalEle++;
            }
            rightCol--;
            //bottomRow
            for(int j=rightCol;j>=leftCol && totalEle<m*n;j--){
                list.add(arr[bottomRow][j]);
                totalEle++;
            }
            bottomRow--;
            //leftCol
            for(int i=bottomRow;i>=topRow && totalEle<m*n;i--){
                list.add(arr[i][leftCol]);
                totalEle++;
            }
            leftCol++;
        }
        return list;
    }
}