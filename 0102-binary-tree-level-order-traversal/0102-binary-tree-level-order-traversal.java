class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>>list=new ArrayList<>();
        if(root!=null) q.add(root);
        while(q.size()!=0){
            int size=q.size();
           List<Integer> tempList=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=q.peek();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            tempList.add(temp.val);
            q.remove();
        }
        list.add(tempList);
        }
        return list;
    }
}