class Solution {
    public void postorder(TreeNode root,List<Integer>l){
        if(root==null) return;
        postorder(root.left,l);
        postorder(root.right,l);
        l.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        postorder(root,l);
        return l;
    }
}