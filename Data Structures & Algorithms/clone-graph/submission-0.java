/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Map<Node, Node> visited = new HashMap<>();
        return dfs(node, visited);
    }
    public Node dfs(Node node, Map<Node, Node> visited) {
        if (visited.containsKey(node)) {
            return visited.get(node);
        }
        visited.put(node, new Node(node.val));
        for (Node neighbor : node.neighbors) {
            visited.get(node).neighbors.add(dfs(neighbor, visited));
        }
        return visited.get(node);
    }
}