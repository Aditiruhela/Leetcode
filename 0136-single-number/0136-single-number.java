class Solution {
    public int singleNumber(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=arr.length;
        for(int x:arr){
            if(map.containsKey(x)) map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        for(int x:map.keySet()){
            if(map.get(x)==1) return x;
        }
        return -1;
    }
}