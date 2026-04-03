class Solution {
    public int[] asteroidCollision(int[] arr) {
        int n=arr.length;
        //- --> represents only direction
        //jb + and - takrayenge tb hi blast hoga 
        Stack<Integer>st=new Stack<>();
        for(int x:arr){
            if(x>0) st.push(x);
            else{
                while(st.size()!=0 && st.peek()>0 && st.peek()<Math.abs(x))st.pop();
                if(st.size() != 0 && st.peek()==Math.abs(x)) st.pop();
                else if(st.size()==0 || st.peek()<=0) st.push(x); 
            }
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int x:st){
            list.add(x);
        }
        int []ans=new int[list.size()];
        int i=0;
        for(int x:list){
            ans[i]=x;
            i++;
        }
        return ans;
    }
}
