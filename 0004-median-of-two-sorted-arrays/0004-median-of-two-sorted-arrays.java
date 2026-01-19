
public class Solution {
    public double  findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
           int [] num= new int[m+n];
        for(int i=0;i<m;i++){
            num[i]=nums1[i];
        }
        for(int j=0;j<n;j++){
            num[j+m]=nums2[j];
        }
        sort(num);
        int k=num.length;
        if(k%2!=0){
            return (num[k/2]);
        }else{
            return ((num[k/2] + num[(k/2)-1] )/2.0);
        }
    }
    private void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
    
 