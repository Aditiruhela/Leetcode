class Solution {
    public void swap(char[]arr,int i,int j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }
    public String reverseVowels(String s) {
        String v="aeiouAEIOU";
        char[] arr=s.toCharArray();
        int n=s.length();
        int i=0,j=n-1;
        while(i<j){
            if(v.indexOf(arr[i])==-1) i++;
            else if(v.indexOf(arr[j])==-1) j--;
            else{
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}