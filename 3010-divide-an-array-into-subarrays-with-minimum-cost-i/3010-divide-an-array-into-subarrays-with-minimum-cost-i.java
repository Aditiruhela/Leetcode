class Solution {
    public int minimumCost(int[] arr) {
        int n=arr.length;
        int cost=arr[0];
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]<min1){
                min2=min1;
                min1=arr[i];
            }else if(arr[i]<min2){
                min2=arr[i];
            }
        }
        return cost+min1+min2;
    }
}