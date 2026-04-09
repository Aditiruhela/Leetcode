class Solution {
    public boolean isValidBST(TreeNode root) {
        return  isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isValidBST(TreeNode root,long min,long max){
        if(root==null) return true;
        if(root.val<=min || root.val>=max) return false;
        if(!isValidBST(root.left,min,root.val)) return false;
        if(!isValidBST(root.right,root.val,max)) return false;
        else return true;
    }
}