class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        int count=0;
        String ans="";
       for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(count>0) ans+=ch;
                count++;
            }else{
                count--;
                if(count>0) ans+=ch;
            }
       }
       return ans;
    }
}