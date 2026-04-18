class Solution {
    public long minCost(String s, int[] arr) {
        HashMap<Character,Long>map=new HashMap<>();
        int n=arr.length;
        long total=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            total+=arr[i];
            if(map.containsKey(ch)) map.put(ch,map.get(ch)+arr[i]);
            else map.put(ch,(long)arr[i]);
        }
        long max=0;
        for(long x:map.values()){
            if(x>max) max=x;
        }
        return total-max;
    }
}