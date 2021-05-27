package BinaryTree;
public class BinaryTreeNumberOfLeafNode {
    static BinaryTreeNode root;

    BinaryTreeNumberOfLeafNode() {
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
        System.out.println(numberOfLeafNode(root));
    }

    static int numberOfLeafNode(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        else if (root.left == null && root.right == null) {
            return 1;
        }
        return numberOfLeafNode(root.left) + numberOfLeafNode(root.right);
    }
}
