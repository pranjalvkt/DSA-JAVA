/*
*   @author
*   Pranjal Tripathi
*/
package BinaryTree;
import java.util.*;

class ZigZagTraversal {

    static BinaryTreeNode root;

    ZigZagTraversal() {
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

        System.out.println(zigzagLevelOrder(root));
    }

    public static List<List<Integer>> zigzagLevelOrder(BinaryTreeNode root) {
        List<List<Integer>> bfs = new ArrayList<>();
        boolean leftToRight = true;
        if(root == null) return bfs;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new LinkedList<>();
            for(int i = 0; i < levelSize; i++) {
                BinaryTreeNode current = queue.poll();
                if(leftToRight) {
                    currentLevel.add(current.data);
                }
                else {
                    currentLevel.add(0, current.data);
                }
                
                if(root.left != null) {
                    queue.offer(root.left);
                }
                if(root.right != null) {
                    queue.offer(root.right);
                }
            }
            bfs.add(currentLevel);
            leftToRight = !leftToRight;
        }
        return bfs;
    }
}