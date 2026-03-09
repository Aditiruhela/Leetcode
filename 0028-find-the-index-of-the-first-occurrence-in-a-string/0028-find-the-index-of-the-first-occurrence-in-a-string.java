class Solution {
    public int strStr(String h, String n) {
        for(int i=0;i<=h.length()-n.length();i++){
                if(h.contains(n)) return i;
            }
        return -1;
    }
}