class Solution {
    public String largestNumber(int[] nums) {
        String []words=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            words[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(words,(a,b)->(b+a).compareTo(a+b));
        if(words[0].equals("0")) return "0";
        String s="";
        for(String x:words) s+=x;
        return s;
    }
}