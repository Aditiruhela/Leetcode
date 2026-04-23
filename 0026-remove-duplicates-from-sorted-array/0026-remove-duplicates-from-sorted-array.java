class Solution {
    public int removeDuplicates(int[] arr) {
        int n=arr.length;
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        for(int x:arr){
            set.add(x);
        }
        int i=0;
        for(int x:set){
            arr[i++]=x;
        }
        return set.size();
    }
}