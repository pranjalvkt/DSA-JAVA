package BinaryTree;
/*
*   @author
*   Pranjal Tripathi
*/
public class BinaryTreeNumberOfFullNodes {
    static BinaryTreeNode root;

    BinaryTreeNumberOfFullNodes() {
        root = null;
    }

    public static void main(String[] args) {
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

        System.out.println(numberOfFullNode(root));
    }

    static int numberOfFullNode(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        else if (root.left == null && root.right == null) {
            return 0;
        }
        return numberOfFullNode(root.left) + numberOfFullNode(root.right) + ((root.left != null) && (root.right != null) ? 1 : 0);
    }
}
