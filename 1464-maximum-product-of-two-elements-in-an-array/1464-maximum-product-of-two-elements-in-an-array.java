class Solution {
    public int maxProduct(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int i=n-1;
        int j=n-2;
        return (arr[i]-1)*(arr[j]-1);
    }
}