class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int min=Integer.MAX_VALUE;
        int negCount=0;
        long sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]<0) negCount++;
                int absolute=Math.abs(matrix[i][j]);
                sum+=absolute;
                min=Math.min(min,absolute);
            }
        }
        if(negCount%2==0) return sum;
        else return sum-2*min;
    }
}
// class Solution {
//     public long maxMatrixSum(int[][] matrix) {
//         int n = matrix.length;
//         long totalSum = 0;
//         int negativeCount = 0;
//         int minAbsValue = Integer.MAX_VALUE;

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 int value = matrix[i][j];
//                 totalSum += Math.abs(value);
//                 if (value < 0) {
//                     negativeCount++;
//                 }
//                 minAbsValue = Math.min(minAbsValue, Math.abs(value));
//             }
//         }

//         if (negativeCount % 2 == 0) {
//             return totalSum;
//         } else {
//             return totalSum - 2 * minAbsValue;
//         }
//     }
// }