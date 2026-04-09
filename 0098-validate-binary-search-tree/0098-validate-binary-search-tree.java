class Solution {
    public boolean isValidBST(TreeNode root) {
        return  isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isValid(TreeNode root,long lmax,long rmin){
        if(root==null) return true;
        if(root.val<=lmax || root.val>=rmin) return false;
        boolean left=isValid(root.left,lmax,root.val);
        boolean right=isValid(root.right,root.val,rmin);
        return left&& right;
    }
}