class Solution {
    public boolean isBalanced(String s) {
        int sum1=0;
        int sum2=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(i%2==0) sum1+=ch-'0';
            else sum2+=ch-'0';
        }
        if(sum1==sum2) return true;
        return false;
    }
}