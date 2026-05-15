class Solution {
    public int vowelConsonantScore(String s) {
        int v=0;
        int c=0;
        int n=s.length();
        String vowels="aeiou";
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                if(vowels.indexOf(ch)!=-1) v++;
                else c++;
            }
        }
        int score=0;
        if(c>0) 
        score=(int)Math.floor(v/c);
        else score=0;
        return score;
    }
}