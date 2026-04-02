class Solution {
    public int countStudents(int[]arr, int[] s) {
        Queue<Integer>q=new LinkedList<>();
        for(int x:arr) q.add(x);
        int count=0,i=0;
        while(q.size()!=0 && q.size()!=count){
            if(q.peek()==s[i]){
                q.poll();
                i++;
                count=0;
            }else{
                q.add(q.poll());
                count++;
            }
        }
        return q.size();
    }
}