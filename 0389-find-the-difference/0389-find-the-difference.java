class Solution {
    public char findTheDifference(String s, String t) {
    HashMap<Character,Integer>map=new HashMap<>();
    for(char ch:s.toCharArray()){
        if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
        else map.put(ch,1);
    }
    for(char ch:t.toCharArray()){
        if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
        else map.put(ch,1);
    }
    char ans=' ';
    for(char ch:map.keySet()){
        if(map.get(ch)==1){
            ans=ch;
            break;
        }
    }
    return ans;
}
}