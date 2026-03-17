class Solution {
     public int gcd(int a ,int b){
        if(b==0) return a;
        return gcd(b,a%b);
     }
    public boolean hasGroupsSizeX(int[] arr){
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr){
            if(map.containsKey(x)) map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        int g=0;
        for(int x:map.keySet()){
            g=gcd(g,map.get(x));
        }
        return g>=2;
    }
}