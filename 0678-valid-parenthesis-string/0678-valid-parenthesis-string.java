class Solution {
    public boolean checkValidString(String s) {
        Stack <Integer>st=new Stack<>();
        Stack <Integer>gt=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(') st.push(i);
            else if(ch=='*') gt.push(i);
            else{
                if(st.size()!=0) st.pop();
                else if(gt.size()!=0) gt.pop();
                else{
                    return false;
                }
            }
        }
        while(st.size()!=0 && gt.size()!=0){
            if(st.peek()<gt.peek()){
                st.pop();
                gt.pop();
            }else{
                return false;
            }
        }
        return st.size()==0;
    }
}