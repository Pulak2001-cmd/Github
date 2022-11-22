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
    public List<Integer> preorder(Node root) {
        List<Integer> l = new ArrayList<>();
        return dfs(root, l);
    }
    public List<Integer> dfs(Node root, List<Integer> list){
        if(root == null) return list;
        list.add(root.val);
        for(int i=0; i<root.children.size(); i++){
            list = dfs(root.children.get(i), list);   
        }
        return list;
    }
}