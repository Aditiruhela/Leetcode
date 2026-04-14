class Solution {
    public int getMinDistance(int[] arr, int k, int s) {
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]==k) min=Math.min(Math.abs(i-s),min);
        }
        return min;
    }
}