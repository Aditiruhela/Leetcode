class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        int n=arr.length;
    //     int difference=0;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             if(i!=j && arr[i]==arr[j]){
    //             difference=Math.abs(j-i);
    //             if(difference<=k) return true;
    //         }
    //     }
    //     }
    //  return false;
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<n;i++){
    if(map.containsKey(arr[i])){
        if(i-map.get(arr[i])<=k) 
        return true;
    }
    map.put(arr[i],i);
    }
    return false;
    }
}