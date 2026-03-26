class Solution {
    public boolean isPalindrome(String s,int i,int j){
        int n=s.length();
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }
    public int countSubstrings(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s,i,j)){
                    count++;
                }
            }
        }
        return count;
    }
}