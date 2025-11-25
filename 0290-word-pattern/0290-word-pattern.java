class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String>map=new HashMap<>();
        String []words=s.split(" ");
        int i=0;
        for(char ch:pattern.toCharArray()){
            String w=words[i];
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(w)) return false;
            }else {
                    if(map.containsValue(w)) return false;
                    map.put(ch,w);
                }
                i++;
        }
    return true;
    }
}