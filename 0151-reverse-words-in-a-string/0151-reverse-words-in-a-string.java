class Solution {
    public String reverseWords(String s) {
        String [] words=s.trim().split(" ");
        int n=words.length;
        String ans="";
        for(int i=n-1;i>=0;i--){
            if(words[i].length()!=0)
            ans+=words[i]+" ";
        }
        return ans.trim();
    }
}