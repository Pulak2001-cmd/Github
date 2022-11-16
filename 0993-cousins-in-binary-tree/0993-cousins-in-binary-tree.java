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
    Set<Integer> p = new HashSet<>();
    public boolean isCousins(TreeNode root, int x, int y) {
        Set<Integer> s = new HashSet<>();
        dfs(root, x, y, s, 0, root.val);
        return s.size() == 1 && p.size() == 2;
    }
    public void dfs(TreeNode root, int x, int y, Set<Integer> s, int height, int prev){
        if(root == null) return;
        height++;
        if(root.val == x||root.val == y){
            s.add(height);
            p.add(prev);
        }
        prev = root.val;
        if(root.left != null){
            dfs(root.left, x, y, s, height, prev);
        }
        if(root.right != null){
            dfs(root.right, x, y, s, height, prev);
        }
    }
}