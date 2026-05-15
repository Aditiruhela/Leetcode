class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        int n=word.length();
        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch) && 
            word.indexOf(Character.toUpperCase(ch))!=-1 && 
            word.indexOf(ch)==i)
            count++;
        }
        return count;
    }
}