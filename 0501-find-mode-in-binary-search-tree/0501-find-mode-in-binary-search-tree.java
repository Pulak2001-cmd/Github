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
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        dfs(root, mp);
        int max =0;
        for (Map.Entry<Integer,Integer> mapElement : mp.entrySet()) {
            int value = mapElement.getValue();
            max = Math.max(max, value);
        }
        List<Integer> l = new ArrayList<>();
        for (Map.Entry<Integer,Integer> mapElement : mp.entrySet()) {
            if(mapElement.getValue() == max){
                l.add(mapElement.getKey());
            }
        }
        int[] ans = new int[l.size()];
        for(int i=0;i<l.size();i++){
            ans[i] = l.get(i);
        }
        return ans;
    }
    public void dfs(TreeNode root, HashMap<Integer, Integer> m){
        if(root == null){
            return;
        }
        m.put(root.val, m.getOrDefault(root.val, 0)+1);
        if(root.left != null){
            dfs(root.left, m);
        }
        if(root.right != null){
            dfs(root.right, m);
        }
    }
}