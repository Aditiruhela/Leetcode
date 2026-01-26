class Solution {
    public int mostWordsFound(String[] arr) {
        int n=arr.length;
        int count=0;
        int max=0;
        for(int i=0;i<n;i++){
            count=0;
            String []words=arr[i].trim().split(" ");
            if(words.length!=0) count=words.length;;
            max=Math.max(max,count);
        }
        return max;
    }
}