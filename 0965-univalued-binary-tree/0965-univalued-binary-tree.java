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
    public boolean isUnivalTree(TreeNode root) {
        Set<Integer> s = new HashSet<>();
        dfs(root, s);
        return s.size() == 1;
    }
    public void dfs(TreeNode root, Set<Integer> s){
        if(root == null){
            return;
        }
        s.add(root.val);
        if(root.left != null){
            dfs(root.left, s);
        }
        if(root.right != null){
            dfs(root.right, s);
        }
    }
}