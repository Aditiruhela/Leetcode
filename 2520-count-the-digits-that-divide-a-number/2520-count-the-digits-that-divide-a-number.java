class Solution {
    public int countDigits(int n) {
        int temp=n;
        ArrayList<Integer>list=new ArrayList<>();
        while(temp!=0){
            int digit=temp%10;
            list.add(digit);
            temp/=10;
        }
        int count=0;
        for(int x:list){
            if(n%x==0) count++;
        }
        return count;
    }
}