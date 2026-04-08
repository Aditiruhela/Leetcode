class Solution {
    public String reverse(String s){
        char []arr=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);
    }
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(st.size()!=0 && s.charAt(i)==st.peek()) st.pop();
            else st.push(s.charAt(i));
        }
        String ans="";
        while(st.size()!=0){
            ans+=st.pop();
        }
        return reverse(ans);
    }
}