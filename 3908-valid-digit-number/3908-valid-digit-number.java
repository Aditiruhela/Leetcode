class Solution {
    public boolean validDigit(int n, int x) {
        int temp=n;
        boolean flag1=false;
        while(temp!=0){
            int digit=temp%10;
            if(digit==x) flag1=true;
            temp/=10;
        }
        boolean flag2=false;
        temp=n;
        while(temp>=10) temp=temp/10;
        if(temp!=x) flag2=true;
        else flag2=false;
        if(flag1 && flag2) return true;
        return false;
    }
}