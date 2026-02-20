class Solution {
    public List<Integer> luckyNumbers(int[][] arr) {
        int r=arr.length;
        int c=arr[0].length;
        int []row=new int[r];
        for(int i=0;i<r;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<c;j++){
                min=Math.min(min,arr[i][j]);
            }
            row[i]=min;
        }
        int []col=new int[c];
        for(int j=0;j<c;j++){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<r;i++){
                max=Math.max(arr[i][j],max);
            }
            col[j]=max;
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==row[i] && arr[i][j]==col[j]){
                    list.add(arr[i][j]);
                }
            }
        }
        return list;
    }
}