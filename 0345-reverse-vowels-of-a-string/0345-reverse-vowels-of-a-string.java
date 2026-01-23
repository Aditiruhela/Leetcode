class Solution {
    public String reverseVowels(String s) {
        String vowels="aeiouAEIOU";
        char []arr=s.toCharArray();
        int n=s.length();
        int i=0,j=n-1;
        while(i<j){
            if(!vowels.contains(arr[i]+"")) i++;
            else if(!vowels.contains(arr[j]+"")) j--;
            else{
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
            i++;
            j--;
            }
        }
        String ans="";
        for(int k=0;k<n;k++){
            ans+=arr[k];
        }
        return ans;
    }
}