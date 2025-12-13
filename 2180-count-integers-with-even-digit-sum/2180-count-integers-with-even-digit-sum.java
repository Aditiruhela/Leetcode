class Solution {
    public int digitSum(int n){
        int sum=0;
        int temp=n;
        while(temp!=0){
            int digit=temp%10;
            sum+=digit;
            temp/=10;
        }
        return sum;
    }
    public int countEven(int n) {
        int count=0;
        int sum=0;
        int temp=n;
        for(int i=1;i<=n;i++){
        if(digitSum(i)%2==0) count++;
        }
        return count;
    }
}