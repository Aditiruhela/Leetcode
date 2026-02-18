class Solution {
    public int[] twoSum(int[] arr, int t) {
        int n=arr.length;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==t){
                    list.add(i+1);
                    list.add(j+1);
            }
        }
        }
        int []ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}
