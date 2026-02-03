class Solution {
    public boolean isIncreasing(int[]arr,int i,int j){
        for(int k=i;k<j;k++){
        if(arr[k]>=arr[k+1])return false;
        }
        return true;
    }
    public boolean isDecreasing(int[]arr,int i,int j){
        for(int k=i;k<j;k++){
        if(arr[k]<=arr[k+1]) return false;
        }
        return true;
    }
    public boolean isTrionic(int[] arr) {
        int n=arr.length;
        if(n<4) return false;
        for(int i=1;i<=n-3;i++){
            for(int j=i+1;j<=n-2;j++){
                if(!isIncreasing(arr,0,i)) continue;
                if(!isDecreasing(arr,i,j)) continue;
                if(!isIncreasing(arr,j,n-1)) continue;
                return true;
            }
        }
        return false;
    }
}
