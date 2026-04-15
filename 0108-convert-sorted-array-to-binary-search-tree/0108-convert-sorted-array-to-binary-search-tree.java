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
    public TreeNode sortedArrayToBST(int[]arr) {
    return sort(arr,0,arr.length-1);
    }
    public TreeNode sort(int[]arr,int left,int right){
        if(left>right) return null;
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=sort(arr,left,mid-1);    //root.right likhna hi padega
        root.right=sort(arr,mid+1,right); //root.left likhna hi padega
        return root;
    }
}