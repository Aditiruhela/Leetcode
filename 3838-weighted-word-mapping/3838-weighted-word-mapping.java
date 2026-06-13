class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans="";
        for(String x:words){
            int sum=0;
            for(char y:x.toCharArray()){
                sum+=weights[y-'a'];
            }
            int val=sum%26;
            ans+=(char)('z'-val);
        }
        return ans;
    }
}