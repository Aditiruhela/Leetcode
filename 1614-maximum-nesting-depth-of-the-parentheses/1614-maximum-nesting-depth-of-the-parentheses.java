class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int count=0;
        int max=0;
        for(int i=0;i<n;i++){
            char x=s.charAt(i);
            if(x=='('){
                count++;
                max=Math.max(count,max);
            }
            else if(x==')')count--;
        }
        return max;
    }
}