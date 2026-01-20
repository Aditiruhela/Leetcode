class Solution {
    public int addDigits(int n) {
        int temp=n;
        int sum;
        int ans=0;
        if(temp<10) ans=temp;
        while(temp>=10){
            sum=0;
            while(temp!=0){
            int digit=temp%10;
            sum+=digit;
            temp/=10;
            }
            temp=sum; //sum ko temp bana denge ki and we check the outer loop kyuki hmne sum ko temp me dala so we see ki temp >= h ya nai then agr nai h to ans me daal denge
            ans=temp;
        }
        return ans;
    }
}