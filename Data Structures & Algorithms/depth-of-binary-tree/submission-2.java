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
    int maxDepth = 0;
    public int maxDepth(TreeNode root) {
        depth(root, 0);
        return maxDepth;
    }

    int depth(TreeNode root, int val) {
        if (root == null) {
            return val;
        }
        val += 1;
        
        int left = depth(root.left, val);
        int right = depth(root.right, val);
        int treeDepth = Math.max(left, right);
        maxDepth = Math.max(treeDepth, maxDepth);
        return val;
    }
}
