class Solution {
    public char findTheDifference(String s, String t) {
        int XOR=0;
        for(char x:s.toCharArray()){
            XOR^=x;
        }
        for(char x:t.toCharArray()){
            XOR^=x;
        }
        return (char)XOR;
    }
}