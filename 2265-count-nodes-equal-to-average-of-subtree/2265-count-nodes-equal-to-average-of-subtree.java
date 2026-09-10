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
    int count=0;
    long sum(TreeNode node){
        if(node==null){
            return 0;
        }

        long tem=(((node.val*10000)+sum(node.left)+sum(node.right)))+1;
        long sum=tem/10000;
        long n=tem%10000;

        if(node.val==sum/n){
            count++;
        }
        return tem;
    }
    public int averageOfSubtree(TreeNode root) {
        
        long tem=sum(root);
        return count;
    }
}