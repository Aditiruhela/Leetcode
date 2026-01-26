class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>>list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=1;i<n;i++){
            int diff=Math.abs(arr[i]-arr[i-1]);
            if(diff<min){
                min=diff;
                list=new ArrayList<>();
                list.add(Arrays.asList(arr[i-1],arr[i]));
            }else if(diff==min) list.add(Arrays.asList(arr[i-1],arr[i]));
        }
        return list;
    }
}