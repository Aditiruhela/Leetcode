class Solution {
    public boolean checkPerfectNumber(int n) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=1;i<n;i++){
            if(n%i==0) list.add(i);
        }
        int sum=0;
        for(int x:list){
            sum+=x;
        }
        if(sum==n) return true;
        else return false;
    }
}