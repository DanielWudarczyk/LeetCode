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
import java.util.ArrayList;

class BSTIterator {
    private ArrayList<Integer> inorder=new ArrayList<>();
    private int i=0;

    public BSTIterator(TreeNode root) {
        inorderFill(root);
    }

    public int next() {
        return inorder.get(i++);
    }

    public boolean hasNext() {
        return i<inorder.size();
    }

    private void inorderFill(TreeNode root){
        if(root!=null){
            inorderFill(root.left);
            inorder.add(root.val);
            inorderFill(root.right);
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */