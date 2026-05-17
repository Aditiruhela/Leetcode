/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return 1+Math.max(left,right);
    }
}

//ON GFG
// class Solution {
//     public int height(Node root) {
//         // code here
//         if(root==null) return -1;
//         int left=height(root.left);
//         int right=height(root.right);
//         return 1+Math.max(left,right);
//     }
// }