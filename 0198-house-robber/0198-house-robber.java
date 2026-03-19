class Solution {
    public int rob(int[] arr) {
        int n=arr.length;
        int rob=0; //chori ki
        int norob=0; //no chori
        for(int i=0;i<n;i++){
           int newrob=norob+arr[i];  //newchori=isse pehle nochori+ curr chori
           int nonewrob=Math.max(norob,rob); //no newchori=max(chori,nochori);
           rob=newrob;  //chori=curr chori
           norob=nonewrob; //nochori=curr nochori
        }
        return Math.max(rob,norob); //maximum of (chori,nochori)
    }
}