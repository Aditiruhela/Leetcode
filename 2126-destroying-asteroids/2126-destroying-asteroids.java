class Solution {
    public boolean asteroidsDestroyed(int mass, int[]arr) {
        int n=arr.length;
        Arrays.sort(arr);
        long m=mass;
        for(int x:arr){
            if(m<x) return false;
            m+=x;
        }
        return true;
    }
}