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
    List<List<Integer>> res=new ArrayList<>();

    void bfs(Queue<TreeNode> q){
        if(q.isEmpty())return;
        int len=q.size();
        List<Integer> cell=new ArrayList<>();
        while(len-->0){
            TreeNode node=q.poll();
            int tem=node.val;
            cell.add(tem);

            
            if(node.left!=null)q.add(node.left);
            if(node.right!=null)q.add(node.right);
        }
        bfs(q);
        res.add(cell);

    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null)return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        bfs(q);

        return res;
    }
}