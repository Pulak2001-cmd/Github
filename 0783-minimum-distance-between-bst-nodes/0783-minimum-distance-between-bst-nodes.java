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
    public int minDiffInBST(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        dfs(root, l);
        System.out.println(l.size());
        Collections.sort(l);
        int diff = Integer.MAX_VALUE;
        for(int i=1;i<l.size();i++){
            diff = Math.min(diff, l.get(i)-l.get(i-1));
        }
        return diff;
    }
    public void dfs(TreeNode root, List<Integer> l){
        if(root == null){
            return;
        }
        l.add(root.val);
        if(root.left != null){
            dfs(root.left, l);
        }
        if(root.right != null){
            dfs(root.right, l);
        }
    }
}