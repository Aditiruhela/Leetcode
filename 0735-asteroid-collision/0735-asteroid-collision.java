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
        int []ans=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}
