package BinarySearchTree;
import BinaryTree.*;

public class DeleteNodeInBST {
    static BinaryTreeNode root;

    DeleteNodeInBST() {
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
        root = deleteNode(root, 7);
        
        // PRINTING BST
        BinaryTreeTraversal.preOrder(root);
    }

    static BinaryTreeNode findMin(BinaryTreeNode root) {
        while(root.left != null) root = root.left;
        return root;
    }

    static BinaryTreeNode deleteNode(BinaryTreeNode root, int data) {
        if (root == null) {
            return root;
        } else if (data < root.data) {
            root.left = deleteNode(root.left, data);
        } else if (data > root.data) {
            root.right = deleteNode(root.right, data);
        } else {
            if (root.left == null && root.right == null) {
                root = null;
            } else if (root.left == null) {
                // BinaryTreeNode temp = root;
                root = root.right;
                // temp = null;
            } else if (root.right == null) {
                // BinaryTreeNode temp = root;
                root = root.left;
                // temp = null;
            } else {
                BinaryTreeNode temp = findMin(root.right);
                root.data = temp.data;
                root.right = null;
            }
        }
        return root;
    }
}
