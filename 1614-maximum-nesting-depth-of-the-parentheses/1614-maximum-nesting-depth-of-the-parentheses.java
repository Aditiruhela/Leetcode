class Solution {
    public int maxDepth(String s) {
        int max=0;
        int curr=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                curr++;
                max=Math.max(curr,max);
            }else if(s.charAt(i)==')'){
                curr--;
            }
        }
        return max;
    }
}