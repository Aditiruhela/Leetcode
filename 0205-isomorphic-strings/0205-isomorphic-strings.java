class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>map=new HashMap<>();
        if(s.length()!=t.length()) return false;
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(map.containsKey(ch1)){
                if(map.get(ch1)!=ch2) return false;
                else map.put(ch1,ch2);
            }else{
                if(map.containsValue(ch2)) return false;
                else map.put(ch1,ch2);
            }
        }
        return true;
    }
}