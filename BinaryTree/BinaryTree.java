package BinaryTree;
/*
*   @author
*   Pranjal Tripathi
*/
/**
 * BInaryTree
 */

public class BinaryTree {

    static BinaryTreeNode root;

    BinaryTree() {
        root = null;
    }
    
    public static void main(String[] args) {
        // BinaryTree tree = new BinaryTree(); // No need of class object, because root is defined as static. 
        root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(7);
    }

}