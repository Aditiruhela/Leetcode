class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
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
            if(map.containsKey(x) && map.get(x)>0){
                list.add(x);
                map.put(x,map.get(x)-1);
            }
        }
        int []arr=new int[list.size()];
        int k=0;
        for(int x:list){
            arr[k]=x;
            k++;
        }
        return arr;
    }
}