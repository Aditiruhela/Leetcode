class Solution {
    public void swap(char []arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public boolean canBeEqual(String s1, String s2) {
        char []arr1=s1.toCharArray();
        char []arr2=s2.toCharArray();
        int n=arr1.length;
        if(arr1.length!=arr2.length) return false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(j-i==2){
                    swap(arr1,i,j);
                    if(Arrays.equals(arr1,arr2)) return true;
                   
        for(int x=0;x<n;x++){
            for(int y=i+1;y<n;y++){
                if(y-x==2){
                    swap(arr1,x,y);
                    if(Arrays.equals(arr1,arr2)) return true;
                   swap(arr1,x,y);
                }
            }
        }
        swap(arr1,i,j);
                }
            }
        }

        return Arrays.equals(arr1,arr2);

    }
}
