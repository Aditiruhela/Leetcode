class Solution {
    public List<String> generateParenthesis(int n) {
    ArrayList<String>res=new ArrayList<String>();
        solve(res,0,0,"",n);
        return res;
    }
    public void solve(List<String>res,int open,int close ,String s,int n) {
        if(s.length()==n*2){
            res.add(s);
            return;
        }
        if(open<n) solve(res,open+1,close,s+"(",n);
        if(close <open) solve(res,open,close+1,s+")",n);
    }
}

