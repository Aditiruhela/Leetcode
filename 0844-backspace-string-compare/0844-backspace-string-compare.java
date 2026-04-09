class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>st=new Stack<>();
        Stack<Character>gt=new Stack<>();
        for(char x:s.toCharArray()){
            if(x=='#'){
                if(!st.isEmpty()) st.pop();
            }
            else st.push(x);
        }
        for(char x:t.toCharArray()){
            if(x=='#'){
                if(!gt.isEmpty()) gt.pop();
            }
            else gt.push(x);
        }
        String ans1="";
        String ans2="";
        for(int x:st) ans1+=x;
        for(int x:gt) ans2+=x;
        return ans1.equals(ans2);
    }
}
