class Solution {
    public int longestConsecutive(int[] arr) {
        int n=arr.length;
        if(n==0) return 0;
        TreeSet<Integer>set=new TreeSet<>();
        for(int x:arr) set.add(x);
        int count=1;
        int max=1;
        ArrayList<Integer>list=new ArrayList<>(set);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)+1==list.get(i+1)) count++;
            else break;
            if(count>max) max=count;
        }
        return max;
    }
}