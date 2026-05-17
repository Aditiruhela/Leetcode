class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char x=s.charAt(i);
            if(st.size()==0){
                st.push(x);
                continue;
            }
            if(x==']' && st.peek()=='[') st.pop();
            else if(x==')' && st.peek()=='(') st.pop();
            else if(x=='}' && st.peek()=='{') st.pop();
            else st.push(x);
        }
        if(st.size()==0) return true;
        else return false;
    }
}