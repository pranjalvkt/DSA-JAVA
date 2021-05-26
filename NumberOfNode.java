/*
*   @author
*   Pranjal Tripathi
*/
/**
 * NumberOfNode
 */

public class NumberOfNode {
    static BinaryTreeNode root;

    NumberOfNode() {
        root = null;
    }
    
    public static void main(String[] args) {
        NumberOfNode tree = new NumberOfNode();
        root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);
        root.right.left = new BinaryTreeNode(6);
        root.right.right = new BinaryTreeNode(7);
        System.out.println(tree.numNode(root));
    }

    public int numNode(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + numNode(root.left) + numNode(root.right);
    }
}