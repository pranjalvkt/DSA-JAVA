package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/*
*   @author
*   Pranjal Tripathi
*/
public class LevelOrderSuccessor {

    static BinaryTreeNode root;

    LevelOrderSuccessor() {
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
        BinaryTreeNode n = levelOrderSuccessor(root, 4);
        System.out.println(n.data);

    }

    /* YE BTAYEGA KI, GIVEN "KEY" KE SAME LEVEL PE KAUNSA NODE HAI
    e.g., 4 KA LEVEL ORDER SUCCESSOR 5 HOGA KYUKI DONO SAME LEVEL PE HAIN
    */
    static BinaryTreeNode levelOrderSuccessor(BinaryTreeNode root, int key) {
        if (root == null) {
            return null;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode current = queue.poll();
            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }

            if (current.data == key) {
                break;
            }
        }
        return queue.poll();
    }
}
