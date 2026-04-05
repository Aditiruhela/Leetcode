class Solution {
    public boolean judgeCircle(String s) {
        int L=0,R=0,U=0,D=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='U') U++;
            if(ch=='D') D++;
            if(ch=='L') L++;
            if(ch=='R') R++;
        }
        if(U==D && L==R) return true;
        else return false;
    }
}