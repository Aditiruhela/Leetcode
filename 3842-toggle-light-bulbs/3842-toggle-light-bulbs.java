class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> arr) {
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr) if(map.containsKey(x)) map.put(x,map.get(x)+1);
        else map.put(x,1);
        for(int x:map.keySet()){
            if(map.get(x)%2!=0) list.add(x);
        }
        Collections.sort(list);
        return list;
    }
}