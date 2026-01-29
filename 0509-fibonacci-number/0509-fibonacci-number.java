class Solution {
    public int fib(int n) {
        //base case
        if(n==0 || n==1) return n;
        //recursive call
        int x=fib(n-1);
        int y=fib(n-2);
        //cal
        return x+y;
    }
}