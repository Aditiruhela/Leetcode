class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>st=new Stack<>();
        Stack<Character>gt=new Stack<>();
        for(char x:s.toCharArray()){
            if(x=='#'){
                if(!st.isEmpty())st.pop();
            }
            else st.push(x);
        }
        for(char x:t.toCharArray()){
            if(x=='#'){
                if(!gt.isEmpty())gt.pop();
            }
            else gt.push(x);
        }
        String str1="";
        String str2="";
        for(int x:st)str1+=x;
        for(int x:gt)str2+=x;
        if(str1.equals(str2)) return true;
        else return false;
    }
}