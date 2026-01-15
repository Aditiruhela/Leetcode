class Solution {
    public int findPeakElement(int[] arr) {
        int n=arr.length;
        // if(n==1 || arr[0]>arr[1]) return 0;

        // for(int i=1;i<n-1;i++){
        //     if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) return i;
        // }
        // if(arr[n-1]>arr[n-2]) return n-1;
        // return -1;
        int start=1;
        int end=n-2;
        if(n==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;
        while(start<=end){
        int mid=start+(end-start)/2;
        if(arr[mid]>arr[mid-1] && arr[mid+1]<arr[mid]) return mid;
        else if(arr[mid]>arr[mid-1]) start=mid+1;
        else if(arr[mid]>arr[mid+1]) end=mid-1;
        else start=mid+1;
        }
        return -1;
    }
}