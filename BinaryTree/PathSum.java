/*
*   @author
*   Pranjal Tripathi
*/

package BinaryTree;

public class PathSum {
    public static void main(String[] args) {
        //
    }
    public boolean hasPathSum(BinaryTreeNode root, int targetSum) {
        if(root == null) return false;
        if(root.data == targetSum && root.left == null && root.right == null) return true;
        return hasPathSum(root.left, targetSum - root.data) || hasPathSum(root.right, targetSum - root.data);
    }  
}
