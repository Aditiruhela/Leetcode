class Solution {
    public void swap(int i,int j,char[]arr){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
    }
    public String reverseVowels(String s) {
        String v="AEIOUaeiou";
        int n=s.length();
        int i=0;
        int j=n-1;
        char []arr=s.toCharArray();
        while(i<j){
            if(v.indexOf(arr[i])==-1)i++;
            else if(v.indexOf(arr[j])==-1)j--;
            else{
                swap(i,j,arr);
                i++;
                j--;
        }
        }
        return new String(arr);
    }
}