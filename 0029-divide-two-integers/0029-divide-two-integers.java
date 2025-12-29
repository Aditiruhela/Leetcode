class Solution {
    public int divide(int n, int x) {
        if(n==Integer.MIN_VALUE && x==-1) return Integer.MAX_VALUE;
        return n/x;
    }
}