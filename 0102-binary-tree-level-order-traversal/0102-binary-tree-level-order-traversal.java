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
        List<List<Integer>> res= new ArrayList<>();

        Queue<TreeNode> qNode= new LinkedList<>();
        if(root==null) {
            return res;
        }
        qNode.offer(root);
        while(!qNode.isEmpty()) {
            List<Integer> el= new ArrayList<>();
            int size= qNode.size();
            for(int i=0;i<size;i++) {
             TreeNode rem= qNode.poll();
             System.out.println(rem.val);
            
            el.add(rem.val);
            
            if(rem.left!=null) {
                qNode.offer(rem.left);

            }
            if(rem.right!=null) {
                qNode.offer(rem.right);
            }

            }
            res.add(el);
           
            
        }
        return res;
    }
}