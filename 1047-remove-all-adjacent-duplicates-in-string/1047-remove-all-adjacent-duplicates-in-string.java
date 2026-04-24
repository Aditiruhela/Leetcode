class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(st.size()!=0 && ch==st.peek()) st.pop();
            else st.push(ch);
        }
        String ans="";
        for(char x:st) ans+=x;
        return ans;
    }
}