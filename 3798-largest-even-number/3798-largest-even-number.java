class Solution {
    public String largestEven(String s) {
        int n=s.length();
        while(n!=0){
        int lastDigit=s.charAt(n-1)-'0';
        if(lastDigit%2==0) return s.substring(0,n);
        n--;
        }
        return"";
    }
}