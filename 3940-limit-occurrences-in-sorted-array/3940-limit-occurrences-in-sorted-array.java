class Solution {
    public int[] limitOccurrences(int[]arr, int k) {
        int n=arr.length;
        ArrayList<Integer>l=new ArrayList<>();
        int count=1;
        l.add(arr[0]);
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]) count++;
            else count=1;
            if(count<=k) l.add(arr[i]);
        }
        int[]ans=new int[l.size()];
        int i=0;
        for(int x:l){
            ans[i++]=x;
        }
        return ans;
    }
}