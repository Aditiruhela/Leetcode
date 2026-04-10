class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(st.size()!=0 && s.charAt(i)==st.peek()) st.pop();
            else st.push(s.charAt(i));
        }
        String ans="";
        for(char x:st) ans+=x;
        return ans;
    }
}