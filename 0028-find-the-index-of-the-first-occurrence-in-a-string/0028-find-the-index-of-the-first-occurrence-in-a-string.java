class Solution {
    public int strStr(String h, String n) {
        for(int i=0;i<=h.length()-n.length();i++){
            
        boolean flag=true;
            int t=i;
            for(int j=0;j<n.length();j++){
            if(h.charAt(t)!=n.charAt(j)){
                flag=false;
                break;
            }
            t++;
        }
        if(flag) return i;
        }
        return -1;
    }
}