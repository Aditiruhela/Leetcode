class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        int maxFreq=0;
        for(int y:map.keySet()){
            maxFreq=Math.max(maxFreq,map.get(y));
        }
        int []list=new int[k];
        int index=0;
        while(index<k){
        for(int y:map.keySet()){
            if(map.get(y)==maxFreq){
            list[index++]=y;
            }
            if(index==k) break;
        }
        maxFreq--;
        }
        return list;
    }
}