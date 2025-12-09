class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int k=arr.length;
        if(n==0) return true;
        for(int i=0;i<k;i++){
            if(arr[i]==0){
                int left = (i==0)?0:arr[i-1];
                int right = (i==k-1)?0:arr[i+1];
                if(left==0 && right==0){
                arr[i]=1;
                n--;
            }
            }
        }
        if(n==0) return true;
        else return false;
    }
}