package BinaryTree;
/*
*   @author
*   Pranjal Tripathi
*/
public class BinaryTreeTraversal {

    static BinaryTreeNode root;
    BinaryTreeTraversal() {
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

        /*
        Binary Tree: 

                        1

                2               3

            4       5       6       7

            
        */

        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }

    //Pre-Order
    static void preOrder(BinaryTreeNode root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // In-Order
    static void inOrder(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void postOrder(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

}
