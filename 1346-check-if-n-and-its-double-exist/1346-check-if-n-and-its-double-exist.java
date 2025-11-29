class Solution {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        boolean flag=false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(i!=j && arr[i]==2*arr[j]){
                    flag=true;
                }
            }
        }
        return flag;
    }
}