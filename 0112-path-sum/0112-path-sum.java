class Solution {
    public boolean find(TreeNode root,int target){
        if(root==null) return false;
        if(root.left==null && root.right==null) return target==root.val;
        boolean left=find(root.left,target-root.val);
        boolean right=find(root.right,target-root.val);
        return left || right;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return find(root,targetSum);
    }
}