class Solution {
    private boolean palindrome(String s){
        int n=s.length();
        int i=0,j=n-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        char []arr=s.toCharArray();
        int n=arr.length;
        String res="";
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                    String ans=s.substring(i,j);
                  if(palindrome(ans)){
                    if(ans.length()>res.length()) res=ans;
                  }
            }
        }
        return res;
    }
}