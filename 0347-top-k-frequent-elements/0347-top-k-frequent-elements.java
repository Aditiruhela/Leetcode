class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr){
            if(map.containsKey(x)) map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        int []ans=new int[k];
        for(int i=0;i<k;i++){
            int max=Integer.MIN_VALUE;
            int num=0;
        for(int x:map.keySet()){
            if(map.get(x)>max){
                max=map.get(x);
               num=x;
            }
        }
        ans[i]=num;
        map.remove(num);
        }
        return ans;
    }
}