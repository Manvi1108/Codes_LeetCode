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
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return res;
        }
        TreeNode node = root;
        q.offer(node);
        while(!q.isEmpty()){
            List<Integer> sub = new ArrayList<>();
            int levelNum = q.size();
            for(int i=0; i<levelNum; i++){
                node = q.poll();
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
                sub.add(node.val);
            }
            res.add(sub);
        }
        return res;
    }
}