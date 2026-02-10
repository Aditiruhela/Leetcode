class Solution {
    public int arrangeCoins(int n) {
    int i;
    for(i=1;(long)i*(i+1)/2<=n;i++){}
    return i-1;
    }
}