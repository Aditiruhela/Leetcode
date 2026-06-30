class Solution {
    public boolean isBipartite(int[][]arr) {
        int n=arr.length;
        int m=arr[0].length;
        int []color=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(!dfs(arr,i,color,0)) return false;
            }
        }
        return true;
    }
    private boolean dfs(int[][]arr,int node,int []color,int c){
        color[node]=c;
        for(int x:arr[node]){
            if(color[x]==-1){
                if(!dfs(arr,x,color,1-c)) return false;
            }else if(color[x]==c) return false;
        }
        return true;
    }
}