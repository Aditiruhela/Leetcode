class Solution {
    private boolean dfs(int node, ArrayList<ArrayList<Integer>> adj,int[]vis,int[]pathvis){
        vis[node]=1;
        pathvis[node]=1;
        for(int x:adj.get(node)){
            if(vis[x]==0){
                if(dfs(x,adj,vis,pathvis)) return true;
            }else if(pathvis[x]==1) return true;
        }
        pathvis[node]=0;
        return false;
    }
    public boolean canFinish(int n, int[][]arr) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
         for (int i = 0; i < n; i++)
           adj.add(new ArrayList<>());
        for (int i = 0; i < arr.length; i++) {
            adj.get(arr[i][1]).add(arr[i][0]);
        }
        int []vis=new int[n];
        int []pathvis=new int[n];
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                if(dfs(i,adj,vis,pathvis)) return false;
            }
        }
        return true;
    }
}