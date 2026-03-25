class Solution {
    public void swap(char[]arr,int i,int j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
    }
    public String reverseVowels(String s) {
        char[]arr=s.toCharArray();
        String vowels="AEIOUaeiou";
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            if(vowels.indexOf(arr[i])==-1) i++;
            else if(vowels.indexOf(arr[j])==-1) j--;
            else {
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}