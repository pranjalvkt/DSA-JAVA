package BinaryTree;

import java.util.*;

/*
*   @author
*   Pranjal Tripathi
*/
/**
 * LevelOrderTraversal
 */
public class LevelOrderTraversal {
    static BinaryTreeNode root;

    LevelOrderTraversal() {
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

        System.out.println(traverse(root));
    }

    static List<List<Integer>> traverse(BinaryTreeNode root) {
        List<List<Integer>> bfs = new ArrayList<>();
        if (root == null) {
            return bfs;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                BinaryTreeNode current = queue.poll();
                currentLevel.add(current.data);
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            bfs.add(currentLevel);
        }
        return bfs;
    }

}