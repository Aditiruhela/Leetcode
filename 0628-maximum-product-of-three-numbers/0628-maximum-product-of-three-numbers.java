class Solution {
    public int maximumProduct(int[] arr) {
        Arrays.sort(arr);
        int sum=0;
        int n=arr.length;
        sum=arr[n-1]*arr[n-2]*arr[n-3];
        return sum;
    }
}