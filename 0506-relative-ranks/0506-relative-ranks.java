class Solution {
    public String[] findRelativeRanks(int[]arr) {
        int n=arr.length;
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)-> b[0]-a[0]);
        String[]ans=new String[n];
        for(int i=0;i<n;i++){
            pq.add(new int[]{arr[i],i});
        }
        int rnk=1;
        while(pq.size()!=0){
            int[]curr=pq.remove();
            int i=curr[1];
            if(rnk==1) ans[i]="Gold Medal";
            else if(rnk==2) ans[i]="Silver Medal";
            else if(rnk==3) ans[i]="Bronze Medal";
            else ans[i]=String.valueOf(rnk);
            rnk++;
        }
        return ans;
    }
}