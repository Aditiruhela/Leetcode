class Solution {
    public int[] findErrorNums(int[] arr) {
        int n=arr.length;
        int total=n*(n+1)/2;
        int sum=0;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
           sum+=arr[i];
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr){
            if(map.containsKey(x)) map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        for(int x:map.keySet()) if(map.get(x)>1)list.add(x);
        int missing =total-sum+list.get(0);
        list.add(missing);
        int []ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}