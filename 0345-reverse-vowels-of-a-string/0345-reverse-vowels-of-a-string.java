class Solution {
    private void swap(char[]arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public String reverseVowels(String s) {
        char []words=s.toCharArray();
        String vowels="AEIOUaeiou";
        int n=words.length;
        int i=0,j=n-1;
        while(i<j){
            if(vowels.indexOf(words[i])==-1)i++;
            else if(vowels.indexOf(words[j])==-1)j--;
           else{
                swap(words,i,j);
                i++;
                j--;
            }
        }
        return new String(words);
    }
}