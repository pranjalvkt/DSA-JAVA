/*
*   @author
*   Pranjal Tripathi
*/

package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {
    static BinaryTreeNode root;

    MinimumDepthOfBinaryTree() {
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

        System.out.println(minDepth(root));

    }

    static int minDepth(BinaryTreeNode root) {
        int minimumDepth = 0;
        if (root == null) {
            return 0;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            minimumDepth++;
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                BinaryTreeNode current = queue.poll();
                if (current.left == null && current.right == null) {
                    return minimumDepth;
                }

                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
        }
        return minimumDepth;
    }
}
