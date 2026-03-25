class Solution {
    public boolean detectCapitalUse(String words) {
        if(words.equals(words.toLowerCase())) return true;
        else if(words.equals(words.toUpperCase())) return true;
        else{
                for(int i=1;i<words.length();i++){
                if(Character.isUpperCase(words.charAt(i))) return false;
            }
        }
        return true;
    }
}