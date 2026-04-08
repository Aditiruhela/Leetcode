class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer>list=new ArrayList<>();
        if(root!=null) q.add(root);
        while(q.size()!=0){
            int size=q.size();
           List<Integer> tempList=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                tempList.add(temp.val);
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
        }
        list.add(tempList.get(tempList.size()-1));
        }
        return list;
    }
}