package BinaryTree;

public class SymmetricTree {
    public boolean isSymmetric(BinaryTreeNode root) {
        return findSymmetric(root, root);
    }

    public boolean findSymmetric(BinaryTreeNode root1, BinaryTreeNode root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;
        return (root1.data == root2.data) && findSymmetric(root1.left, root2.right)
                && findSymmetric(root1.right, root2.left);
    }
}
