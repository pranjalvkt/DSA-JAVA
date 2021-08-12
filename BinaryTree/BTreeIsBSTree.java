package BinaryTree;

public class BTreeIsBSTree {

    static BinaryTreeNode root;

    BTreeIsBSTree() {
        root = null;
    }

    public static void main(String[] args) {
        root = new BinaryTreeNode(5);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(7);
        root.left.left = new BinaryTreeNode(1);
        root.left.right = new BinaryTreeNode(3);
        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(8);
        System.out.println(isBinarySearchTree(root));
    }

    static boolean isBSTUtil(BinaryTreeNode root, int minVal, int maxVal) {
        if (root == null) return true;
        if (root.data < minVal && root.data > maxVal && isBSTUtil(root.left, minVal, root.data) && isBSTUtil(root.right, root.data, maxVal)) {
            return true;
        } else {
            return false;
        }
    }
    static boolean isBinarySearchTree(BinaryTreeNode root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
