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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null)q.add(root);
        while(!q.isEmpty()){
            int len=q.size();
            long sum=0;
            int n=0;
            while(len-->0){
                TreeNode node=q.poll();
                sum+=node.val;
                n++;

                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }
            res.add(sum/(double)n);
        }

        return res;
    }
}