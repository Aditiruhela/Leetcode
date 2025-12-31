class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int x:nums){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int x:map.keySet()){
            if(map.get(x)>1) list.add(x);
        }
        return list;
    }
}