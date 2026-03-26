class Solution {
    public int compress(char[] chars) {
        String s=new String(chars);
        String result="";
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int count=0;
            while(i<s.length() && s.charAt(i)==ch){
                count++;
                i++;
            }
            result+=ch;
            if(count>1) result+=count;
            i--; 
        }

        for (int i = 0; i < result.length(); i++) {
            chars[i] = result.charAt(i);
        }

        return result.length();
    }
}