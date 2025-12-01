class Solution {
    public int thirdMax(int[] arr) {
        TreeSet<Integer>set=new TreeSet<>();
        for(int x:arr){
            set.add(x);
        }
        ArrayList<Integer>list=new ArrayList<>(set);
        int n=list.size();
        if(n==0){
            return 0;
        }
        else if(n==1){
            return list.get(0);
        }
        else if(n==2){
            return list.get(1);
        }
        return list.get(n-3);
    }
}