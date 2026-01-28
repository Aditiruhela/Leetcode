class Solution {
    public int sumOfUnique(int[] arr) {
        int sum=0;
        int n=arr.length;
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int x:arr) if(map.containsKey(x)) map.put(x,map.get(x)+1);
       else map.put(x,1);
       for(int x:map.keySet()) if(map.get(x)==1) sum+=x;
       return sum;
    }
}