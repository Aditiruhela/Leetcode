class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        String[] words=s.split("");
        StringBuilder sb=new StringBuilder();
        int n=words.length;
        for(int i=0;i<n;i++){
            sb.append(words[i]);
        }
        int i=0,j=n-1;
        while(i<j){
            if(sb.charAt(i)==sb.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}