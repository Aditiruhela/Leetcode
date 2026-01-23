class Solution {
    public boolean isGood(int[] arr) {
        int n=arr.length;
        int max=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr){
            max=Math.max(x,max);
            if(map.containsKey(x)) map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        for(int x:map.keySet()){
            if(x==max){
                if(map.get(x)!=2) return false;
            }else{
                if(map.get(x)!=1) return false;
            }
        }
        for(int i=1;i<=max;i++){
            if(!map.containsKey(i)) return false;
        }
        return true;
    }
}