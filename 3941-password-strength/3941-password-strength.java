class Solution {
    public int passwordStrength(String s) {
        int count=0;
        int n=s.length();
        char []arr=s.toCharArray();
        HashSet<Character>set=new HashSet<>();
        for(char x:arr) set.add(x);
        for(char ch:set){
            if(ch>='a' && ch<='z') count++;
            else if(ch>='A' && ch<='Z') count+=2;
            else if(ch>='0' && ch<='9') count+=3;
            else count+=5;
        }
        return count;
    }
}