class Solution {
    public boolean checkIfPangram(String s) {
        String g="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<g.length();i++){
        if(s.indexOf(g.charAt(i))==-1) return false;
        }
        return true;
    }
}