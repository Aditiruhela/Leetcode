class Solution {
    public int mostFrequentEven(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr){
            if(x%2==0){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
            }
        }
        int maxFreq=-1;
        int ans=-1;
        for(int x:map.keySet()){
            if(map.get(x)>maxFreq || map.get(x)==maxFreq && x<ans){
                maxFreq=map.get(x);
                ans=x;
            }
        }
        return ans;
    }
}