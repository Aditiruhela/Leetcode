class Solution {
    public int[] productExceptSelf(int[] arr) {
    int n=arr.length;
    int []nums=new int[arr.length];
    for(int i=0;i<n;i++){
        nums[i]=1;
        for(int j=0;j<n;j++){
            if(i!=j) nums[i]*=arr[j];
        }
    }  
    return nums; 
    }
}