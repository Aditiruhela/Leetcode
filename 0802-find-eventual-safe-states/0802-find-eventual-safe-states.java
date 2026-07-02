class Solution {
    public List<Integer> eventualSafeNodes(int[][]arr) {
        int n=arr.length;
        int vis[]=new int[n];
        int pathVis[]=new int[n];
        int check[]=new int[n];
        ArrayList<Integer>safeNode=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(vis[i]==0) dfs(i,arr,vis,pathVis,check);
        }
        for(int i=0;i<n;i++){
            if(check[i]==1) safeNode.add(i);
        }
        return safeNode;
    }
    private boolean dfs(int node,int [][]arr,int []vis,int []pathVis,int[]check){
        vis[node]=1;
        pathVis[node]=1;
        check[node]=0;
        for(int i:arr[node]){
            if(vis[i]==0){
                if(dfs(i,arr,vis,pathVis,check)) return true;
            }else if(pathVis[i]==1) return true;
        }
        check[node]=1;
        pathVis[node]=0;
        return false;
    }
}