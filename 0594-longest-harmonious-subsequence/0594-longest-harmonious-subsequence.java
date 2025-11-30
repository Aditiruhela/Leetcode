class Solution {
    public int findLHS(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        int ans=0;
        for(int y:map.keySet()){
            if(map.containsKey(y+1)){
                int total=map.get(y)+map.get(y+1);
                ans=Math.max(ans,total);
            }
    }
    return ans;
    }
}