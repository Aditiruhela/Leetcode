class Solution {
    public int numEnclaves(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int[][]vis=new int[n][m];
        int[] delrow={-1,0,1,0};
        int[]delcol={0,1,0,-1};
        //first row
        for(int j=0;j<m;j++){
            if(vis[0][j]==0 && arr[0][j]==1) dfs(0,j,vis,arr,delrow,delcol);
        }
        //last row
        for(int j=0;j<m;j++){
            if(vis[n-1][j]==0 && arr[n-1][j]==1) dfs(n-1,j,vis,arr,delrow,delcol);
        }
        //first col
        for(int i=0;i<n;i++){
            if(vis[i][0]==0 && arr[i][0]==1) dfs(i,0,vis,arr,delrow,delcol);
        }
        //last col
        for(int i=0;i<n;i++){
            if(vis[i][m-1]==0 && arr[i][m-1]==1) dfs(i,m-1,vis,arr,delrow,delcol);
        }
        // count the remaining 1's
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && arr[i][j]==1)cnt++;
        }
    }
    return cnt;
    }

    public void dfs(int row,int col,int[][]vis,int[][]arr,int[]delrow,int[]delcol){
        vis[row][col]=1;
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<4;i++){
        int nrow=row+delrow[i];
        int ncol=col+delcol[i];
        if(nrow>=0 && nrow<n &&
           ncol>=0 && ncol<m &&
           vis[nrow][ncol]==0 &&
           arr[nrow][ncol]==1) dfs(nrow,ncol,vis,arr,delrow,delcol);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna