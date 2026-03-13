class Solution {
    public int findGCD(int[] arr) {
        int n=arr.length;
        int maxi=1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }
        for(int i=1;i<=min;i++){
            if(min % i==0 && max % i==0){
                 maxi=Math.max(maxi,i);
            }
        }
        return maxi;
    }
}