class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char x:s.toCharArray()){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else map.put(x,1);
        }
        PriorityQueue<Character>pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
    pq.addAll(map.keySet());
    String ans="";
    while(pq.size()>1){
        char a=pq.poll();
        char b=pq.poll();
        ans+=a;
        ans+=b;
        map.put(a,map.get(a)-1);
        map.put(b,map.get(b)-1);
        if(map.get(a)>0) pq.add(a);
        if(map.get(b)>0) pq.add(b);
    }
        if(!pq.isEmpty()){
            char a=pq.poll();
            if(map.get(a)>1) return "";
            ans+=a;
        }
        return ans;
    }
}