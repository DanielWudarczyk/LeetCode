/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 1. Jeśli root to null lub znaleźliśmy p/q, zwracamy root
        if (root == null || root == p || root == q) {
            return root;
        }

        // 2. Szukamy w lewym poddrzewie
        TreeNode left = lowestCommonAncestor(root.left, p, q);

        // 3. Szukamy w prawym poddrzewie
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // 4. Jeśli p i q są po przeciwnych stronach, root jest LCA
        if (left != null && right != null) {
            return root;
        }

        // 5. Jeśli znaleźliśmy tylko po jednej stronie, zwracamy ten wynik
        return left != null ? left : right;
    }
}