class Solution {
    public int minimumDistance(int[] arr) {
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]==arr[j] && arr[j]==arr[k]){
                        min=Math.min(min,Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i));
                    }
                }
            }
        }
        return (min==Integer.MAX_VALUE)?-1:min;
    }
}