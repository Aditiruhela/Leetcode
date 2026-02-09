class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>>list=new ArrayList<>();
        backtrack(list,new ArrayList<>(),arr,0);
        return list;
    }
    public void backtrack(List<List<Integer>>set,List<Integer>tempSet,int[]arr,int start){
        set.add(new ArrayList<>(tempSet));
        for(int i=start;i<arr.length;i++){
        tempSet.add(arr[i]);
        backtrack(set,tempSet,arr,i+1);
        tempSet.remove(tempSet.size()-1);
        }
    }
}