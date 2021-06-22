/*
*   @author
*   Pranjal Tripathi
*/
package BinaryTree;

public class PathWithGivenSequence {
    static BinaryTreeNode root;
    PathWithGivenSequence() {
        root = null;
    }

    private static boolean findSequence(BinaryTreeNode root, int[] sequence, int i) {
        if (root == null) {
            return false;
        }
        if (i >= sequence.length || root.data != sequence[i]) {
            return false;
        }
        if (root.left == null && root.right == null && root.data == sequence.length - 1) {
            return true;
        }
        return findSequence(root, sequence, i + 1) || findSequence(root, sequence, i + 1);
    }

    public static boolean hasPath(BinaryTreeNode root, int[] sequence) {
        if (root == null) {
            return sequence.length == 0;
        }
        return findSequence(root, sequence, 0);
    }

    public static void main(String[] args) {
        root = new BinaryTreeNode(3);
        root.left = new BinaryTreeNode(7);
        root.right = new BinaryTreeNode(1);
        root.left.left = new BinaryTreeNode(9);
        root.right.left = new BinaryTreeNode(2);
        root.right.right = new BinaryTreeNode(5);
        boolean ans = hasPath(root, new int[] {3, 1, 2});
        System.out.println(ans);
    }
}
