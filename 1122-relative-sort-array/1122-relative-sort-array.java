class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr1){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int x:arr2){
            if(map.containsKey(x)){
                int freq=map.get(x);
                for(int i=0;i<freq;i++){
                    list.add(x);
                }
                map.remove(x);
            }
        }
        ArrayList<Integer>list2=new ArrayList<>(map.keySet());
        Collections.sort(list2);
        for(int num:list2){
            int freq = map.get(num);
        for(int i=0;i<freq;i++){
            list.add(num);
        }
    }
    int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
    return ans;
}
}