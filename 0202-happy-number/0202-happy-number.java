class Solution {
    public boolean isHappy(int n) {
        int temp=n;
        int sum=0;
        HashSet<Integer>set=new HashSet<>();
        while(temp!=1){
            if(set.contains(temp)) return false;
            set.add(temp);
            sum=0;
        while(temp!=0){
            int digit=temp%10;
            sum+=digit*digit;
            temp/=10;
        }
        temp=sum;
        }
        if(temp==1) return true;
        else return false;
    }
}