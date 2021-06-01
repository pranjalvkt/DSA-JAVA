/*
*   @author
*   Pranjal Tripathi
*/

package BinaryTree;

public class MaximumDepthOfBinaryTree {

    static BinaryTreeNode root;
    
    MaximumDepthOfBinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);

        /*
        Binary Tree: 

                        1

                2               3

            4             

            
        */

        System.out.println(maxDepth(root));
    }

    static int maxDepth(BinaryTreeNode root) {
        if(root == null) return 0;
        else return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
