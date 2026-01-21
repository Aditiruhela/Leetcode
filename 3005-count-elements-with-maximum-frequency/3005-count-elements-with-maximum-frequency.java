class Solution {
    public int maxFrequencyElements(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int x:map.keySet()){
            max=Math.max(max,map.get(x));
        }
        for(int x:map.keySet()){
            if(map.get(x)==max)sum+=map.get(x);
        }
        return sum;
    }
}