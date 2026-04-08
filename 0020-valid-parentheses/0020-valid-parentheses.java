class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(st.size()==0){
                st.push(ch);
                continue;
            }
            if(ch==')' && st.peek()=='(') st.pop();
            else if(ch==']' && st.peek()=='[') st.pop();
            else if(ch=='}' && st.peek()=='{') st.pop();
            else st.push(ch);
        }
        if(st.size()!=0) return false;
        else return true;
    }
}