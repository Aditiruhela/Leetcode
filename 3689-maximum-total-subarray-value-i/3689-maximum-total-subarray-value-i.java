class Solution {
    public long maxTotalValue(int[]arr , int k) {
        int max=arr[0];
        int min=arr[0];
        for(int x:arr){
            max=Math.max(max,x);
            min=Math.min(min,x);
        }
        return 1L*(max-min)*k;
    }
}