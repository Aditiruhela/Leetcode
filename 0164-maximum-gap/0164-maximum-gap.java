class Solution {
    public int maximumGap(int[] arr) {
        int n=arr.length;
        if(n<2) return 0;
        Arrays.sort(arr);
        int max=0;
        for(int i=0;i<n-1;i++){
           int diff=arr[i+1]-arr[i];
            max=Math.max(max,diff);
        }
        return max;
    }
}