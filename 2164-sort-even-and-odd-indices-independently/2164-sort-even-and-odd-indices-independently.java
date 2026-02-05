class Solution {
    public void swap(int []arr,int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
    }
    public int[] sortEvenOdd(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i+=2){
            for(int j=i+2;j<n;j+=2){
                if(arr[i]>arr[j]) swap(arr,i,j);
            }
        }
        for(int i=1;i<n;i+=2){
            for(int j=i+2;j<n;j+=2){
                if(arr[i]<arr[j]) swap(arr,i,j);
            }
        }
        return arr;
        }
    }
