class Solution {
    public String removeStars(String s) {
        Stack<Character>st=new Stack<>();
        int n=s.length();
        for(char x:s.toCharArray()){
            if(x=='*'){
                if(st.size()!=0) st.pop();
            }else {
                st.push(x);
            }
        }
        String ans="";
        for(char x:st) ans+=x;
        return ans;
    }
}