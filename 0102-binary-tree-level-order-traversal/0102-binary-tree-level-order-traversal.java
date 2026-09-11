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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> lay=new ArrayList<>();
            int len=q.size();
            while(len-->0){
                TreeNode node=q.poll();
                if(node==null)continue;
                int tem=node.val;
                lay.add(tem);
                q.add(node.left);
                q.add(node.right);
            }
            if(!q.isEmpty())res.add(lay);

        }
        return res;
    }
}