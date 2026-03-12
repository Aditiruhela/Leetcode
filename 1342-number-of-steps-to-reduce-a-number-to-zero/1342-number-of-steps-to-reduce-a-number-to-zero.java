class Solution {
    public int numberOfSteps(int n) {
        int temp=n;
        int count=0;
        while(temp!=0){
            if(temp%2==0)temp/=2;
            else temp=temp-1;
            count++;
        }
        return count;
    }
}