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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> path= new ArrayList<>();
          pathSumHelper(root,targetSum,path, res);
          return res;
        
        
    }

    public void pathSumHelper(TreeNode root, int targetSum, List<Integer> path,List<List<Integer>> res) {
            
        
        if(root==null) {
            return;
        }
        path.add(root.val);
        int rem= targetSum-root.val;
        if(root.left==null && root.right==null && rem==0) {
            res.add(new ArrayList<>(path));
        }
        pathSumHelper(root.left, rem, path, res);
        pathSumHelper(root.right, rem, path, res);
        
        path.remove(path.size()-1);
    }
}