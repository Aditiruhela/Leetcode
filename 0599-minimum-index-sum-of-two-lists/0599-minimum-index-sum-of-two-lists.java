class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String>list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int sum=0;
        int i=0;
        for(String s1:list1){
            int j=0;
            for(String s2:list2){
                if(s1.equals(s2)){
                    sum=i+j;
                    if(sum<min){
                        list.clear();
                        min=Math.min(min,sum);
                        list.add(s1);
                    }else if(sum==min){
                        list.add(s1);
                    }
                }
                j++;
            }
            i++;
        }
        String []ans=new String[list.size()];
        int k=0;
        for(String x:list){
            ans[k]=x;
            k++;
        }
        return ans;
    }
}