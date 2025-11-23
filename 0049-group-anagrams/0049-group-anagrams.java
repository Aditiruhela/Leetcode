class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {        
        HashMap<String,List<String>>map=new HashMap<>();
        for(String ch:strs){
            char[]arr=ch.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(ch);
        }
        return new ArrayList<>(map.values());
    }
}