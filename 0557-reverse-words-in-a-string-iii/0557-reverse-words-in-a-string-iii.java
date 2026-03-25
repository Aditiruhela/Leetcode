class Solution {
    public String reverseWords(String s) {
        String []words=s.split(" ");
        int n=words.length;
        for(int k=0;k<n;k++){        
            char[]arr=words.toCharArray();
            int i=0,j=arr.length-1;
            while(i<j){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            words[k]=new String(arr);
        }
        return String.join(" ",words);
    }
}