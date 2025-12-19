class Solution {
    public int findNumbers(int[] arr) {
        int count2=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int count=0;
            while(arr[i]!=0){
            arr[i]/=10;
            count++;
            }
            if(count%2==0) count2++;
        }
        return count2;
    }
}