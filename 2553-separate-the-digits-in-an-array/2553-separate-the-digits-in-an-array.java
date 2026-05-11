class Solution {
    public int[] separateDigits(int[]arr) {
        int n=arr.length;
        String s="";
        for(int x:arr){
            s+=x;
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(char x:s.toCharArray()){
            list.add(x-'0');
        }
        int []ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}