/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        List<Integer> l = new ArrayList<>();
        dfs(root, l, 0);
        System.out.println(l.size());
        int max = Integer.MIN_VALUE;
        for(int i=0;i<l.size();i++){
            max = Math.max(max, l.get(i));
        }
        return max;
    }
    public void dfs(Node root, List<Integer> l, int height){
        if(root == null){
            System.out.print("height");
            l.add(height);
            return;
        }
        height++;
        System.out.print(root.val+" kkk");
        if(root.children.size() != 0){
        for(int i=0;i<root.children.size();i++){
            dfs(root.children.get(i), l, height);   
        }
        }
        else {
            l.add(height);
        }
    }
}