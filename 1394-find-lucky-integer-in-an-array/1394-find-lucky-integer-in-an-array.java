class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr){
            if(map.containsKey(x)) map.put(x,map.get(x)+1);
            else{
                map.put(x,1);
            }
        }
        int ans=-1;
        for(int x:map.keySet()){
            if(x==map.get(x)){
                ans=Math.max(ans,x);
            }
        }
        return ans;
    }
}