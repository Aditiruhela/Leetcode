class Solution {
    public int reverse(int n){
        int temp=n;
        int rev=0;
        while(temp!=0){
            int digit=temp%10;
            rev=rev*10+digit;
            temp/=10;
        }
        return rev;
    }
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int num1=reverse(num);
        int num2=reverse(num1);
        return temp==num2;
    }
}