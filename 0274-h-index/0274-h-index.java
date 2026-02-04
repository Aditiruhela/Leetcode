class Solution {
    public int hIndex(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr){
            if(map.containsKey(x))
            map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        int max=0;
        int ans=0;
        for(int i=1;i<=n;i++){
            int count=0;
        for(int x:map.keySet()){
            if(x>=i) count+=map.get(x);
        }
        if(count>=i) ans=i;
    }
    return ans;
}
}